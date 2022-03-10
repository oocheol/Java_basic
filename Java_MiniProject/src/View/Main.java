package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Controller.MemberDAO;
import Model.MemberDTO;
import Model.QuizDTO;
import javazoom.jl.player.MP3Player;
import Controller.MusicController;

public class Main {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		MusicController con = new MusicController();
		String path = "";

		System.out.println("==========마쳐죠게임==========");

		System.out.println("==========메인==========");
		boolean stop = true;

		while (stop) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");

			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("==========회원가입==========");

				System.out.print("ID 입력 >> ");
				String id = sc.next();
				System.out.print("pw 입력 >> ");
				String pw = sc.next();
				System.out.print("닉네임 입력 >> ");
				String name = sc.next();

				MemberDTO dto = new MemberDTO(id, pw, name);

				int row = dao.join(dto);

				if (row > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
					System.out.println("이미 등록된 아이디입니다.");
					System.out.println("다른 아이디를 입력해주세요 !");
				}

				break;
			case 2:
				System.out.println("==========로그인==========");

				System.out.print("ID 입력 >> ");
				id = sc.next();
				System.out.print("PW 입력 >> ");
				pw = sc.next();

				MemberDTO loginDTO = new MemberDTO(id, pw);

				MemberDTO resultDTO = dao.login(loginDTO);

				if (resultDTO.getName() != null) {
					System.out.println("==========로그인 성공==========");
					System.out.println("닉네임 : " + resultDTO.getName());

					boolean stop2 = true;
					while (stop2) {
						System.out.print("[1]게임시작 [2]랭킹보기 [3]뒤로가기  >> ");
						int input2 = sc.nextInt();
						String str = sc.nextLine(); // nextLine 에러방지

						int[] arr = new int[10];

						switch (input2) {
						case 1:
							ArrayList<QuizDTO> quiz = dao.quizView();

							for (int i = 0; i < 10; i++) {
								arr[i] = ran.nextInt(quiz.size());

								for (int j = 0; j < i; j++) {
									if (arr[i] == arr[j]) {
										i--;
									}
								}
							}

							System.out.println("============게임시작=========");
							System.out.println("게임룰 설명");
							System.out.println("- 정답 기준 : 정답과 정확하게 일치, 띄어쓰기 포함.");
							System.out.println("- 문제 수 : 10 문제 , 랜덤으로 출력.");
							System.out.println("2회 오답시 힌트 자동 제공.");
							System.out.println("힌트 제공 후 답 입력 기회: 1회");
							System.out.println("- 점수 기준 : 한 문제당 10점, 힌트제공 받을시 -5점");
							System.out.println("=========================================");

							int cnt = 0;
							int hint_cnt = 0;

							for (int i = 1; i <= 10; i++) {
								int r = arr[i - 1];

								for (int j = 1; j <= 2; j++) {

									System.out.println("넌센스퀴즈(" + i + ") " + quiz.get(r).getQuestion());
									
									System.out.print("정답입력 >> ");
									String result1 = sc.nextLine();
									String answer = quiz.get(r).getAnswer();
									if (answer.equals(result1)) {
										System.out.println("정답입니다.");
										cnt++;
										break;
									} else {
										
										System.out.println("틀렸습니다");
										System.out.println();
										if (j == 2) {
											System.out.println("୧⃛힌트제공(-5점)");
											if (quiz.get(r).getHint().contains("mp3")) {
												System.out.println("소리힌트입니다.");
												System.out.println("귀를 기울여주세요!");
												try {
													System.out.println("2");
													TimeUnit.SECONDS.sleep(1);
													System.out.println("1");
													TimeUnit.SECONDS.sleep(1);

													con.play(quiz, r);
													TimeUnit.SECONDS.sleep(3);
													con.stopMusic();
												} catch (InterruptedException e) {
													e.printStackTrace();
												}

											} else {
												System.out.println(quiz.get(r).getHint());
											}

											
											System.out.print("정답입력 >> ");
											result1 = sc.nextLine();
											if (answer.equals(result1)) {
												System.out.println("정답입니다.");
												hint_cnt++;
												break;
											} else {
												System.out.println("틀렸습니다");
											}
										}
									}

								}
								System.out.println("=========================================");

							}
							System.out.println("게임 끝");

							int question = cnt + hint_cnt; // 문제 맞춘 갯수
							int score = cnt * 10 + (hint_cnt * 5);

							System.out.println("★문제 총 " + question + "개 맞추셨으며 점수는 " + score + "점입니다.★");

							resultDTO.setScore(dao.getScore(resultDTO) + score);
							dao.scoreUpdate(resultDTO);

							boolean stop3 = true;
							while (stop3) {

								System.out.println("[1] 재도전 [2]오답노트확인 [3]랭킹확인 [4]게임종료");
								System.out.print("번호를 선택해주세요 : ");
								int answer = sc.nextInt();
								if (answer == 1) {
									System.out.println("게임을 재도전합니다.");
									break;
								} else if (answer == 2) {
									System.out.println("오답노트를 확인하세요");
									for (int i = 0; i < 10; i++) {
										System.out.print(quiz.get(arr[i]).getQuestion() + " ");
										System.out.print(" [정답 : " + quiz.get(arr[i]).getAnswer() + "] ");
										System.out.print("[힌트 : " + quiz.get(arr[i]).getHint() + "]");
										System.out.println();
									}
								} else if (answer == 3) {
									ArrayList<MemberDTO> result = dao.view();
									for (MemberDTO temp : result)
										System.out.println(temp);
								} else if (answer == 4) {
									stop = false;
									stop2 = false;
									stop3 = false;
									break;
								}
							}
							break;
						case 2:
							ArrayList<MemberDTO> result = dao.view();
							for (MemberDTO temp : result)
								System.out.println(temp);
							break;

						case 3:
							System.out.println("=========메인=========");
							stop2 = false;
							break;

						default:
							System.out.println("잘못 입력하셨습니다.");

						}
					}

				} else {
					System.out.println("로그인 실패");
				}

				break;

			case 3:
				stop = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}

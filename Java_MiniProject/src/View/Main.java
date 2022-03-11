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

import Controller.ConsoleHelper;
import Controller.MemberDAO;
import Model.MemberDTO;
import Model.QuizDTO;
import javazoom.jl.player.MP3Player;
import Controller.MusicController;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		MusicController con = new MusicController();
		ConsoleHelper consoleHelper = new ConsoleHelper();
		String path = "";

		System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
		
		System.out.println("🛸　 　🌎　°　　🌓　•　　.°•　　　🚀  🛸　✯ 🛸　 　🌎　°　　🌓　•　　.°•　　　🚀  🛸　✯\r\n"
				+ "　　　★　* 🛰　　　★　* 🛰 　° [  넌센스 퀴즈  ]　　🛰 　°· 🪐 °　　🛰 　°· 🪐\r\n"
				+ ".　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄\r\n"
				+ "▁▂▃▄▅▆▇▇▆▅▄▃▁▂    ▁▂▃▄▅▆▇▇▆▅▄▃▁▂  ▁▂▃▄▅▆▇▇▆▅▄▃▁▂  ▁▂▃▄▅▆▇▇▆▅▄▃▁▂\r\n"
				+ "🛸　 　🌎　°　　🌓　•　　.°•　🚀  🛸　✯ 🚀  🛸　✯ 🛸　 　🌎　°　　🌓　•　　.°•　🚀  🛸　");
		System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
		System.out.println();

		boolean stop = true;

		while (stop) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");

			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println();
				System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
				System.out.println();
				System.out.println("•─────── 회원가입 ☽⋅──────────•");

				System.out.print("ID 입력 >> ");
				String id = sc.next();
				System.out.print("pw 입력 >> ");
				String pw = sc.next();
				System.out.print("닉네임 입력 >> ");
				String name = sc.next();

				MemberDTO dto = new MemberDTO(id, pw, name);

				int row = dao.join(dto);

				if (row > 0) {
					System.out.println("  ∧,,,∧\r\n" + "(  ̳• · • ̳)\r\n" + "/    づ♡   회원가입 성공 ");
					System.out.println();
				} else {
					System.out.println("  ∧,,,∧\r\n" + "( ｡> ﹏ <｡)\r\n" + "/    づ 회원가입 실패 ");
					System.out.println("==이미 등록된 아이디입니다==");
					System.out.println("==다른 아이디를 입력해주세요 !==");
				}

				break;
			case 2:
				System.out.println();
				System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
				System.out.println();
				System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
				System.out.println("░░░░░░█░░░█▀█░█▀▀▀░▀█▀░█▄░█░░░░░");
				System.out.println("░░░░░░█░░░█░█░█░▀█░░█░░█▀██░░░░░");
				System.out.println("░░░░░░▀▀▀░▀▀▀░▀▀▀░░▀▀▀░▀░░▀░░░░░");
				System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");

				System.out.print("ID 입력 >> ");
				id = sc.next();
				System.out.print("PW 입력 >> ");
				pw = sc.next();

				MemberDTO loginDTO = new MemberDTO(id, pw);

				MemberDTO resultDTO = dao.login(loginDTO);

				if (resultDTO.getName() != null) {
					System.out.println();
					System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
					System.out.println();
					System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
					System.out.println("░░░░░█▀▀░█░█░█▀▀░█▀▀░█▀▀░█▀▀░░░░");
					System.out.println("░░░░░▀▀█░█░█░█░░░█▀▀░▀▀█░▀▀█░░░░");
					System.out.println("░░░░░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░░░░");
					System.out.println("░░░░░ "+ resultDTO.getName() + "님이 로그인 하였습니다.░░░░");
					System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");

					int start = 0;
					boolean regame = true;
					boolean stop2 = true;
					int input2 = 0;
					int[] arr = new int[70];

					while (stop2) {
						if (regame) {
							System.out.println();
							System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
							System.out.println();
							System.out.print("[1]게임시작 [2]랭킹보기 [3]뒤로가기  >> ");
							input2 = sc.nextInt();
							String str = sc.nextLine(); // nextLine 에러방지

						}
						switch (input2) {
						case 1:
							con.playBGM();
							ArrayList<QuizDTO> quiz = dao.quizView();

							for (int i = start; i < start + 10; i++) {
								arr[i] = ran.nextInt(quiz.size());

								for (int j = 0; j < i; j++) {
									if (arr[i] == arr[j]) {
										i--;
									}
								}
							}
							char[] animationChars = { '|', '/', '-', '\\' };

							
							for (int i = 0; i <= 100; i++) {
								consoleHelper.clearScreen();
								
								if (i%2==0) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("🛸　 　🌎　°　　🌓　•　　.°•　　　🚀  🛸　✯ 🛸　 　🌎　°　　🌓　•　　.°•　　　🚀  🛸　✯");
								if (i%2==1) {
									consoleHelper.blankPrink(1);
								}
								System.out.println(".　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄");
								if (i%2==0) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("🛸　 　🌎　°　　🌓　•　　.°•　　　🚀  🛸　✯ 🛸　 　🌎　°　　🌓　•　　.°•　　　🚀  🛸　✯");
								if (i%2==1) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄");
								
								if (i%2==0) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ");
								if (i%2==1) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄");
								
								if (i%2==0) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ");

								System.out.println();
								
								System.out.print("   ∧ ＿ ∧  　           \r\n");
								
								System.out.print(" ( ·•︠ ‿•︡ )つ");
								
								consoleHelper.blankPrink(i);
								System.out.print("    —̳͟͞͞⚾️      —̳͟͞͞⚾️\r\n");
								
								
								System.out.print(" (つ　 <  ");
								consoleHelper.blankPrink(i);
								System.out.print("  —̳͟͞͞⚾️       —̳͟͞͞⚾️\r\n");
								
								
								System.out.print(" ｜　 _つ                                         \r\n");
								
								System.out.print(" `し´\r\n");

								
								System.out.print("|￣￣￣￣￣￣￣￣￣|\r\n");
								System.out.print("| 로딩중 ");
								System.out.print(i+"% "+ animationChars[i % 4] +" | \r\n");
								System.out.print("|＿＿＿＿＿＿＿＿＿| \r\n"); 
								consoleHelper.blankPrink(i);
								System.out.print("．．．．．．．．/)─―ヘ\r\n");
								consoleHelper.blankPrink(i);
								System.out.print(" ．．．　　　━／　　　　＼\r\n");
								consoleHelper.blankPrink(i);
								System.out.print("．．．．　 ／　　　　●　　●丶\r\n");
								consoleHelper.blankPrink(i);
								System.out.print(" ．．．　｜　　　　　　　▼　| \r\n");
								consoleHelper.blankPrink(i);
								System.out.print("．．．．　｜　　　　　　　亠ノ     —̳͟͞͞⚾️　\r\n");
								consoleHelper.blankPrink(i);
								System.out.println(" ．．．　 U￣U￣￣￣U￣￣U");

								if (i%2==1) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄");
								
								if (i%2==0) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ");if (i%2==1) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄ ▄");
								
								if (i%2==0) {
									consoleHelper.blankPrink(1);
								}
								System.out.println("▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ");
								
								System.out.println("▁▂▃▄▅▆▇▇▆▅▄▃▁▂  " + "  ▁▂▃▄▅▆▇▇▆▅▄▃▁▂" + "▁▂▃▄▅▆▇▇▆▅▄▃▁▂  "
										+ "  ▁▂▃▄▅▆▇▇▆▅▄▃▁▂");

								try {
									Thread.sleep(70);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}

							}
							
							
							con.stopMusic();

							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
							
							System.out.println("🛸　 　🌎　°　　🌓　•　　.°•　　　🚀  🛸　✯ 🛸　 　🌎　°　　🌓　•　　.°•　　　🚀  🛸　✯\r\n"
									+ "　　　★　* 🛰　　　★　* 🛰 　° [  넌센스 퀴즈  ]　　🛰 　°· 🪐 °　　🛰 　°· 🪐\r\n"
									+ ".　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄ .　　　•　° ★　•  ☄\r\n"
									+ "▁▂▃▄▅▆▇▇▆▅▄▃▁▂    ▁▂▃▄▅▆▇▇▆▅▄▃▁▂  ▁▂▃▄▅▆▇▇▆▅▄▃▁▂  ▁▂▃▄▅▆▇▇▆▅▄▃▁▂\r\n"
									+ "🛸　 　🌎　°　　🌓　•　　.°•　🚀  🛸　✯ 🚀  🛸　✯ 🛸　 　🌎　°　　🌓　•　　.°•　🚀  🛸　");
							System.out.println();
							System.out.println("|￣￣￣￣￣￣￣|\r\n" + "|  게임규칙  | \r\n" + "|＿＿＿＿＿＿＿| \r\n"
									+ "(\\__/) || \r\n" + "(•ㅅ•). || \r\n" + "/ . . . .づ");
							System.out.println(
									  "┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ \r\n"
									+ "│1. 문제는 총 10 문제, 랜덤으로 출력           |\r\n"
									+ "|2. 정답과 정확하게 일치(띄어쓰기 포함)          |\r\n"
									+ "|3. 두번 틀릴 경우 힌트 자동 제공              |\r\n"
									+ "|4. 힌트 제공 후 답 입력 기회는 1번            |\r\n"
									+ "|5. 배점은 문제당 10점(힌트제공 받을 시 5점 )    |\r\n"
									+ "┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
							System.out.println();
							System.out.println("░░█▀▀▀░█▀█░█▄░▄█░█▀▀" + "░░░░█▀▀░▀█▀░█▀█░█▀█░▀█▀░░\r\n" 
											 + "░░█░▀█░█▀█░█░▀░█░█▀▀" + "░░░░▀▀█░░█░░█▀█░██▀░ █░░░\r\n"
											 + "░░▀▀▀░░▀░▀░▀░░░▀░▀▀▀" + "░░░░▀▀▀░░▀░░▀ ▀░▀ ▀░ ▀░░░");
							System.out.println();
							System.out.println();


							int cnt = 0;
							int hint_cnt = 0;

							for (int i = start; i < start + 10; i++) {
								int r = arr[i];

								for (int j = 1; j <= 2; j++) {
									System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
									System.out.println();
									System.out.println("[ 넌센스퀴즈(" + (i + 1) + ") ] " + quiz.get(r).getQuestion());

									System.out.print("정답입력 >> ");
									String result1 = sc.nextLine();
									String answer = quiz.get(r).getAnswer();
									if (answer.contains(result1)) {
										System.out.println();
										con.playSuccess();
										Thread.sleep(70);
										con.stopMusic();
										System.out.println("˚∧＿∧  　+        —̳͟͞͞💗\r\n"
												+ "(  •‿• )つ  —̳͟͞͞ 💗         —̳͟͞͞💗 +\r\n"
												+ "(つ　 <   정 답 !!!     —̳͟͞͞💗\r\n"
												+ "｜　 _つ      +  —̳͟͞͞💗         —̳͟͞͞💗 ˚\r\n"
												+ "`し´");
										
										cnt++;
										break;
									} else {
										
										System.out.println();
										con.playFail();
										Thread.sleep(70);
										con.stopMusic();
										System.out.print("|￣￣￣￣￣￣￣￣￣|\r\n"
												+ "|땡!! 틀렸습니다!!\r\n"
												+ "|＿＿＿＿＿＿＿＿＿| \r\n"
												+ "(\\__/)|| \r\n"
												+ "(•ㅅ•).|| \r\n"
												+ "/ . . . .づ\r\n");
										
										System.out.println();
										if (j == 2) {
											System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
											System.out.println();
											System.out.println(" (V)∧_∧(V)\r\n" + "  ヽ(･ω･)ﾉ   힌트배달이요\r\n" + " 　/  /\r\n"
													+ " ノ￣ゝ\r\n" + "");

											System.out.println();
											if (quiz.get(r).getHint().contains("mp3")) {
												System.out.println("▀▄▀▄ [ 소리힌트입니다 ] ▀▄▀▄▀▄▀");
												System.out.println("▀▄▀▄ [ 귀를 기울여주세요! ] ▀▄▀▄");
												try {
													System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄ 3 ▀▄▀▄▀▄▀▄▀▄▀▄");
													TimeUnit.SECONDS.sleep(1);
													System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄ 2 ▀▄▀▄▀▄▀▄▀▄▀▄");
													TimeUnit.SECONDS.sleep(1);
													System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄ 1 ▀▄▀▄▀▄▀▄▀▄▀▄");
													TimeUnit.SECONDS.sleep(1);

													System.out.println("▀▄▀▄ [ 힌트가 재생중입니다 ] ▀▄▀▄");
													con.play(quiz, r);
													TimeUnit.SECONDS.sleep(4);
													con.stopMusic();
													System.out.println("[ 넌센스퀴즈(" + (i + 1) + ") ] " + quiz.get(r).getQuestion());
												} catch (InterruptedException e) {
													e.printStackTrace();
												}

											} else {
												System.out.println("★★★ 힌트 : " + quiz.get(r).getHint());
											}
											

											System.out.print("정답입력 >> ");
											result1 = sc.nextLine();

											if (answer.contains(result1)) {
												con.playSuccess();
												Thread.sleep(70);
												con.stopMusic();

												System.out.println("˚∧＿∧  　+        —̳͟͞͞💗\r\n"
														+ "(  •‿• )つ  —̳͟͞͞ 💗         —̳͟͞͞💗 +\r\n"
														+ "(つ　 <   정 답 !!!     —̳͟͞͞💗\r\n"
														+ "｜　 _つ      +  —̳͟͞͞💗         —̳͟͞͞💗 ˚\r\n"
														+ "`し´");

												hint_cnt++;
												break;
											} else {
												con.playFail();
												Thread.sleep(70);
												con.stopMusic();

												System.out.print("|￣￣￣￣￣￣￣￣￣|\r\n"
														+ "|땡!! 틀렸습니다!!\r\n"
														+ "|＿＿＿＿＿＿＿＿＿| \r\n"
														+ "(\\__/)|| \r\n"
														+ "(•ㅅ•).|| \r\n"
														+ "/ . . . .づ\r\n");
											}
										}
									}

								}
								System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");

							}
							System.out.println("       ★⋆!! 게임 끝 !!⋆★");

							int question = cnt + hint_cnt; // 문제 맞춘 갯수
							int score = cnt * 10 + (hint_cnt * 5);

							System.out.println("★⋆ ══════════════ ⋆★⋆ ═════════════ ⋆★⋆");
							System.out.println("★문제 총 " + question + "개 맞추셨으며 점수는 " + score + "점입니다.★");
							System.out.println("★⋆ ══════════════ ⋆★⋆ ═════════════ ⋆★⋆");
							System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");

							resultDTO.setScore(dao.getScore(resultDTO) + score);
							dao.scoreUpdate(resultDTO);

							boolean stop3 = true;
							while (stop3) {

								System.out.println("[1] 재도전 [2]오답노트확인 [3]랭킹확인 [4]게임종료");
								System.out.print("번호를 선택해주세요 >> ");
								int answer = sc.nextInt();
								String str2 = sc.nextLine(); // nextLine 에러방지
								if (answer == 1) {
									System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀ 게임을 재도전합니다 ▀▄▀▄▀▄▀▄▀▄▀▄▀");
									start += 10;
									regame = false;
									input2 = 1;
									if (start == 70) {
										System.out.println("====더이상 풀 문제가 없습니다====");
										stop2 = false;
										stop3 = false;
									}
									break;
								} else if (answer == 2) {
									System.out.print("╭──────────────────────────────────╮\r\n"
											+ "            ♡ 오답노트 ♡\r\n" 
											+ "╰──────────────────────────────────╯");

									System.out.println();

									int number = 1;
									for (int i = start; i < start + 10; i++) {
										if (number == 10) {
											System.out.print(number + ". ");
										} else {
											System.out.print("0" + number + ". ");
										}
										System.out.print("[문제 : " + quiz.get(arr[i]).getQuestion() + "] ");
										System.out.println(" [정답 : " + quiz.get(arr[i]).getAnswer() + "] ");
										System.out.print("    [★힌트★ : " + quiz.get(arr[i]).getHint() + "]");
										System.out.println();
										number++;
									}
									System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
								} else if (answer == 3) {
									System.out.print("╭──────────────────────────────────────╮\r\n"
											+ "               ♡ 랭킹 확인 ♡ \r\n" 
											+ "╰──────────────────────────────────────╯\n");

									ArrayList<MemberDTO> result = dao.view();
									for (MemberDTO temp : result)
										System.out.println(temp);
									System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
								} else if (answer == 4) {
									stop = false;
									stop2 = false;
									stop3 = false;
									break;
								}
							}
							break;
						case 2:
							System.out.print("╭──────────────────────────────────────╮\r\n"
									+ "               ♡ 랭킹 확인 ♡ \r\n" 
									+ "╰──────────────────────────────────────╯\n");

							ArrayList<MemberDTO> result = dao.view();
							for (MemberDTO temp : result)
								System.out.println(temp);
							
							break;

						case 3:
							stop2 = false;
							break;

						default:
							System.out.println("잘못 입력하셨습니다.");

						}
					}

				} else {
					System.out.println("░░░░░░░░░░█▀▀░█▀█░▀█▀░█░░░░░░░░░");
					System.out.println("░░░░░░░░░░█▀▀░█▀█░░█░░█░░░░░░░░░");
					System.out.println("░░░░░░░░░░▀░░░▀░▀░▀▀▀░▀▀▀░░░░░░░");

				}

				break;

			case 3:
				stop = false;
				break;
			default:
				System.out.println("░█▄░▄█░▀█▀░█▀▀░▀█▀░█▀█░█░▄▀░█▀▀░");
				System.out.println("░█░▀░█░░█░░▀▀█░░█░░█▀█░█▀▄░░█▀▀░");
				System.out.println("░▀░░░▀░▀▀▀░▀▀▀░░▀░░▀░▀░▀░░▀░▀▀▀░");
			}
		}
		System.out.println("\t" +"☆♬○♩●♪✧♩　　♩✧♪●♩○♬☆ ☆♬○♩●♪✧♩　　♩✧♪●♩○♬☆　　♩✧♪●♩○♬☆");
		System.out.println();
		System.out.println("\t" + "░░█▀▀▀░█▀█░█▄░▄█░█▀▀░" + "░░█▀▀█░█░░░█░█▀▀░█▀█░\r\n" 
					   	+ "\t"  + "░░█ ▀█░█▀█░█░▀░█░█▀▀░" + "░░█░░█░░█░█░░█▀▀░██▀░\r\n"
					   	+ "\t"  + "░░▀▀▀ ░▀░▀░▀░░░▀░▀▀▀░" + "░░▀▀▀▀░░░▀░░░▀▀▀░▀░▀░\r\n");
		System.out.println();
		System.out.println("\t" +"☆♬○♩●♪✧♩　　♩✧♪●♩○♬☆ ☆♬○♩●♪✧♩　　♩✧♪●♩○♬☆　　♩✧♪●♩○♬☆");

	}

}

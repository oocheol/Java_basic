package 뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		// 뮤직플레이어 만들기!!!
		// 자바에서 노래를 재생하는 방법은?
		// 다른 사람들이 열심히 만들어 놓은 클래스들 > .jar 파일
		// 라이브러리
		Scanner sc = new Scanner(System.in);
		// MP3Player 클래스 사용하기
		MP3Player mp3 = new MP3Player();
		String p = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\20220222ArrayList\\실습파일\\";
		// 1) 노래 재생
		mp3.play(p + "Butterfly.mp3");
		// 2) 노래 멈추기
		mp3.stop();
		// 3) 노래가 재생중인지 여부를 알려주는 기능
//		System.out.println(mp3.isPlaying()); // false

		///////////////////////////

		// 1) 뮤직플레이 리스트 만들기
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		// ArrayList에 노래 추가하기
		list.add(new MusicVO("Butterfly", "전영호", p + "Butterfly.mp3"));
		list.add(new MusicVO("Dolphin", "오마이걸", p + "Dolphin.mp3"));
		list.add(new MusicVO("Peaches", "저스틴비버", p + "Peaches.mp3"));
		list.add(new MusicVO("Rollin", "브레이브걸스", p + "Rollin.mp3"));

		int i = 0;
		while (true) {
			System.out.print("[1]재생 [2]이전곡 [3]다음곡 [4]정지 [5]종료");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("=======재생=======");

				// 1. 노래가 재생중인지 판단하기
				if (mp3.isPlaying()) {
					// 2. 노래가 재생중이라면 노래 멈추기
					mp3.stop();
				}
				// 3. 노래 재생(플레이리스트의 0번방에 들어있는 노래 재생하기)
				mp3.play(list.get(i).getPath());

				// 4. 노래 정보 출력하기
				// 출력양식 --> 노래제목 - 가수가 재생중입니다.
				// ex) Butterfly - 전영호가 재생중입니다.
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "가 재생중입니다.");

			} else if (input == 2) {
				System.out.println("=======이전곡=======");

				// 1. 재생 중인 노래가 있다면
				if (mp3.isPlaying()) {
					// 2. 노래 멈추기
					mp3.stop();
				}

				// 3. list안에 있는 이전곡 재생하기
				// 단, 이전곡이 없다면 "이전곡이 없습니다." 출력하기
				// 이전곡이 없다면 마지막곡 인덱스로 초기화
				i--;

				if (i < 0) {
					System.out.println("이전곡이 없습니다.");
					// 마지막 노래로 돌아가자!!
					// i의 값을 마지막index로 초기화
					i = list.size() - 1;
				}
				// 처음곡으로 돌아간 상태 또는 다음곡을 재생하는 기능
				mp3.play(list.get(i).getPath());
				// 어떤 노래가 재생중인지 정보
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "가 재생중입니다.");

			} else if (input == 3) {
				System.out.println("=======다음곡=======");

				// 1. 재생 중인 노래가 있다면
				if (mp3.isPlaying()) {
					// 2. 노래 멈추기
					mp3.stop();
				}
				// 3. musicList안에 있는 다음곡 재생
				// 현재 재생중인 list인덱스 +1의 곡을 재생시킨다.
				// 단, 다음곡이 없다면 "다음곡이 없습니다." 출력하기
				// 마지막 노래에서 다음곡을 누르면 다음곡이 없습니다를 출력한 다음
				// 처음곡으로 돌아가자!!!! (index 다시 0에서부터 시작)
				// hint, 다음곡이 없다는 건 list의 크기를 벗어난 상태

				i++;

				if (i > list.size() - 1) {
					System.out.println("다음곡이 없습니다.");
					// 처음 노래로 돌아가자!! ---> i의 값을 0으로 초기화
					i = 0;
				}
				// 처음곡으로 돌아간 상태 또는 다음곡을 재생하는 기능
				mp3.play(list.get(i).getPath());
				// 어떤 노래가 재생중인지 정보
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "가 재생중입니다.");

			} else if (input == 4) {
				System.out.println("=======정지=======");

				// 1. mp3가 재생중인 여부를 판단하기
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 mp3 멈추기!(노래 멈추기!)
					mp3.stop();
				}

			} else if (input == 5) {
				System.out.println("=======종료=======");
				// 1. mp3가 재생중인 여부를 판단하기
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 mp3 멈추기!(노래 멈추기!)
					mp3.stop();
				}
				break;
			} else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}

		}

	}

}

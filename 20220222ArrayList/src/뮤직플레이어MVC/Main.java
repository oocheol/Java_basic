package 뮤직플레이어MVC;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MusicController con = new MusicController();
		
		MP3Player mp3 = new MP3Player();
		String p = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\20220222ArrayList\\실습파일\\";
		mp3.play(p + "Butterfly.mp3");
		mp3.stop();
		System.out.println(mp3.isPlaying());

		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
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
				con.play(list, i);
				
			} else if (input == 2) {
				System.out.println("=======이전곡=======");

				if (mp3.isPlaying()) {
					mp3.stop();
				}

				i--;

				if (i < 0) {
					System.out.println("이전곡이 없습니다.");
					i = list.size() - 1;
				}
				mp3.play(list.get(i).getPath());
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "가 재생중입니다.");

			} else if (input == 3) {
				System.out.println("=======다음곡=======");

				if (mp3.isPlaying()) {
					mp3.stop();
				}

				i++;

				if (i > list.size() - 1) {
					System.out.println("다음곡이 없습니다.");
					i = 0;
				}
				mp3.play(list.get(i).getPath());
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "가 재생중입니다.");

			} else if (input == 4) {
				System.out.println("=======정지=======");

				con.stopMusic();

			} else if (input == 5) {
				System.out.println("=======종료=======");
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				break;
			} else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}

		}

	}

}

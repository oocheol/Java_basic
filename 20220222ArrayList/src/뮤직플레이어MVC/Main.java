package �����÷��̾�MVC;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MusicController con = new MusicController();
		
		MP3Player mp3 = new MP3Player();
		String p = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\20220222ArrayList\\�ǽ�����\\";
		mp3.play(p + "Butterfly.mp3");
		mp3.stop();
		System.out.println(mp3.isPlaying());

		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		list.add(new MusicVO("Butterfly", "����ȣ", p + "Butterfly.mp3"));
		list.add(new MusicVO("Dolphin", "�����̰�", p + "Dolphin.mp3"));
		list.add(new MusicVO("Peaches", "����ƾ���", p + "Peaches.mp3"));
		list.add(new MusicVO("Rollin", "�극�̺�ɽ�", p + "Rollin.mp3"));

		int i = 0;
		while (true) {
			System.out.print("[1]��� [2]������ [3]������ [4]���� [5]����");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("=======���=======");
				con.play(list, i);
				
			} else if (input == 2) {
				System.out.println("=======������=======");

				if (mp3.isPlaying()) {
					mp3.stop();
				}

				i--;

				if (i < 0) {
					System.out.println("�������� �����ϴ�.");
					i = list.size() - 1;
				}
				mp3.play(list.get(i).getPath());
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "�� ������Դϴ�.");

			} else if (input == 3) {
				System.out.println("=======������=======");

				if (mp3.isPlaying()) {
					mp3.stop();
				}

				i++;

				if (i > list.size() - 1) {
					System.out.println("�������� �����ϴ�.");
					i = 0;
				}
				mp3.play(list.get(i).getPath());
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "�� ������Դϴ�.");

			} else if (input == 4) {
				System.out.println("=======����=======");

				con.stopMusic();

			} else if (input == 5) {
				System.out.println("=======����=======");
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				break;
			} else {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}

		}

	}

}

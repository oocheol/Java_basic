package �����÷��̾�;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		// �����÷��̾� �����!!!
		// �ڹٿ��� �뷡�� ����ϴ� �����?
		// �ٸ� ������� ������ ����� ���� Ŭ������ > .jar ����
		// ���̺귯��
		Scanner sc = new Scanner(System.in);
		// MP3Player Ŭ���� ����ϱ�
		MP3Player mp3 = new MP3Player();
		String p = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\20220222ArrayList\\�ǽ�����\\";
		// 1) �뷡 ���
		mp3.play(p + "Butterfly.mp3");
		// 2) �뷡 ���߱�
		mp3.stop();
		// 3) �뷡�� ��������� ���θ� �˷��ִ� ���
//		System.out.println(mp3.isPlaying()); // false

		///////////////////////////

		// 1) �����÷��� ����Ʈ �����
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		// ArrayList�� �뷡 �߰��ϱ�
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

				// 1. �뷡�� ��������� �Ǵ��ϱ�
				if (mp3.isPlaying()) {
					// 2. �뷡�� ������̶�� �뷡 ���߱�
					mp3.stop();
				}
				// 3. �뷡 ���(�÷��̸���Ʈ�� 0���濡 ����ִ� �뷡 ����ϱ�)
				mp3.play(list.get(i).getPath());

				// 4. �뷡 ���� ����ϱ�
				// ��¾�� --> �뷡���� - ������ ������Դϴ�.
				// ex) Butterfly - ����ȣ�� ������Դϴ�.
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "�� ������Դϴ�.");

			} else if (input == 2) {
				System.out.println("=======������=======");

				// 1. ��� ���� �뷡�� �ִٸ�
				if (mp3.isPlaying()) {
					// 2. �뷡 ���߱�
					mp3.stop();
				}

				// 3. list�ȿ� �ִ� ������ ����ϱ�
				// ��, �������� ���ٸ� "�������� �����ϴ�." ����ϱ�
				// �������� ���ٸ� �������� �ε����� �ʱ�ȭ
				i--;

				if (i < 0) {
					System.out.println("�������� �����ϴ�.");
					// ������ �뷡�� ���ư���!!
					// i�� ���� ������index�� �ʱ�ȭ
					i = list.size() - 1;
				}
				// ó�������� ���ư� ���� �Ǵ� �������� ����ϴ� ���
				mp3.play(list.get(i).getPath());
				// � �뷡�� ��������� ����
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "�� ������Դϴ�.");

			} else if (input == 3) {
				System.out.println("=======������=======");

				// 1. ��� ���� �뷡�� �ִٸ�
				if (mp3.isPlaying()) {
					// 2. �뷡 ���߱�
					mp3.stop();
				}
				// 3. musicList�ȿ� �ִ� ������ ���
				// ���� ������� list�ε��� +1�� ���� �����Ų��.
				// ��, �������� ���ٸ� "�������� �����ϴ�." ����ϱ�
				// ������ �뷡���� �������� ������ �������� �����ϴٸ� ����� ����
				// ó�������� ���ư���!!!! (index �ٽ� 0�������� ����)
				// hint, �������� ���ٴ� �� list�� ũ�⸦ ��� ����

				i++;

				if (i > list.size() - 1) {
					System.out.println("�������� �����ϴ�.");
					// ó�� �뷡�� ���ư���!! ---> i�� ���� 0���� �ʱ�ȭ
					i = 0;
				}
				// ó�������� ���ư� ���� �Ǵ� �������� ����ϴ� ���
				mp3.play(list.get(i).getPath());
				// � �뷡�� ��������� ����
				System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "�� ������Դϴ�.");

			} else if (input == 4) {
				System.out.println("=======����=======");

				// 1. mp3�� ������� ���θ� �Ǵ��ϱ�
				if (mp3.isPlaying()) {
					// 2. ������̶�� mp3 ���߱�!(�뷡 ���߱�!)
					mp3.stop();
				}

			} else if (input == 5) {
				System.out.println("=======����=======");
				// 1. mp3�� ������� ���θ� �Ǵ��ϱ�
				if (mp3.isPlaying()) {
					// 2. ������̶�� mp3 ���߱�!(�뷡 ���߱�!)
					mp3.stop();
				}
				break;
			} else {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}

		}

	}

}

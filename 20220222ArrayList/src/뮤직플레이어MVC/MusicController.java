package �����÷��̾�MVC;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {

	// library play.jar
	// MP3Player ����� ����ϰڴ�.
	MP3Player mp3 = new MP3Player();

	// ����ϴ� ���
	public void play(ArrayList<MusicVO> list, int i) {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(list.get(i).getPath());

		System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "�� ������Դϴ�.");

	}

	// �뷡���� ���
	// stopMusic ---> void
	public void stopMusic() {
		if (mp3.isPlaying()) {
			System.out.println("�뷡 ����");
			mp3.stop();
		} else {
			System.out.println("������� �뷡�� �����ϴ�.");
		}
	}

}

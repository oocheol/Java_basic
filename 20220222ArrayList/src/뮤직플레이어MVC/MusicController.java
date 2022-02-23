package 뮤직플레이어MVC;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {

	// library play.jar
	// MP3Player 기능을 사용하겠다.
	MP3Player mp3 = new MP3Player();

	// 재생하는 기능
	public void play(ArrayList<MusicVO> list, int i) {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(list.get(i).getPath());

		System.out.println(list.get(i).getSong() + " - " + list.get(i).getSinger() + "가 재생중입니다.");

	}

	// 노래정지 기능
	// stopMusic ---> void
	public void stopMusic() {
		if (mp3.isPlaying()) {
			System.out.println("노래 멈춤");
			mp3.stop();
		} else {
			System.out.println("재생중인 노래가 없습니다.");
		}
	}

}

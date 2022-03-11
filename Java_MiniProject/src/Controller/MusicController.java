package Controller;

import java.util.ArrayList;

import Model.QuizDTO;
import javazoom.jl.player.MP3Player;

public class MusicController {

	MP3Player mp3 = new MP3Player();

	
	public void play(ArrayList<QuizDTO> quiz, int i) {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(quiz.get(i).getPath());


	}

	public void playSuccess() {
		
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play("C:/hint/성공.mp3");
		
		
	}
	public void playFail() {
		
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play("C:/hint/실패.mp3");
		
		
	}
	
	public void playBGM() {
		
		
			if (mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play("C:/hint/게임bgm.mp3");
		
		
	}

	public void stopMusic() {
		if (mp3.isPlaying()) {
			mp3.stop();
		} 
	}

}

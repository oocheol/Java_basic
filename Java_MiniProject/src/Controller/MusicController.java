package Controller;

import java.util.ArrayList;

import Model.MusicVO;
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

	public void stopMusic() {
		if (mp3.isPlaying()) {
			mp3.stop();
		} 
	}

}

package ∞‘¿”;

public class GameDummy implements IGame {

	@Override
	public void makeRandom() {
		// nothing
	}

	@Override
	public String getQuizMsg() {
		return "2+3=";
	}

	@Override
	public boolean isCheckAnswer(int answer) {
		return false;
	}


}

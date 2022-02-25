package 게임;

public interface IGame {
	
	// 게임 설계도
	// 로직없는(바디가 없는)메서드만을 포함하는 것 == 인터페이스
	// makeRandom() : void
	// getQuizMsg() : String
	// isCheckAnswer() : Boolean
	
	public abstract void makeRandom();
	public abstract String getQuizMsg();
	public abstract boolean isCheckAnswer(int answer);

}

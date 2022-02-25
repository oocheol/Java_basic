package ����;

public interface IGame {
	
	// ���� ���赵
	// ��������(�ٵ� ����)�޼��常�� �����ϴ� �� == �������̽�
	// makeRandom() : void
	// getQuizMsg() : String
	// isCheckAnswer() : Boolean
	
	public abstract void makeRandom();
	public abstract String getQuizMsg();
	public abstract boolean isCheckAnswer(int answer);

}

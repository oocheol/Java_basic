package ����;

import java.util.Random;

public class PlusGame implements IGame {

	int num1;
	int num2;
	// ������2
	
	@Override
	public void makeRandom() {
		Random ran = new Random();
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
		
		// �������� 2���� ������ ����!!! (1 ~ 10)
		// ex) 3, 9
	}

	@Override
	public String getQuizMsg() {
		// makeRandom���� ������� ������
		// return���ִ� �κ�
		return num1 + " + " + num2 + " = ";
	}

	@Override
	public boolean isCheckAnswer(int answer) {
		// ����ڰ� �Է��� ��(answer)�� �´��� ===> true
		// Ʋ���� ===> false
		
		return answer == num1+num2;
	}

}

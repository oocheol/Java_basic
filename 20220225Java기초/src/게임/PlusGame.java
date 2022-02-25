package 게임;

import java.util.Random;

public class PlusGame implements IGame {

	int num1;
	int num2;
	// 개발자2
	
	@Override
	public void makeRandom() {
		Random ran = new Random();
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
		
		// 랜덤으로 2개의 정수를 생성!!! (1 ~ 10)
		// ex) 3, 9
	}

	@Override
	public String getQuizMsg() {
		// makeRandom에서 만들어진 정수를
		// return해주는 부분
		return num1 + " + " + num2 + " = ";
	}

	@Override
	public boolean isCheckAnswer(int answer) {
		// 사용자가 입력한 답(answer)이 맞는지 ===> true
		// 틀린지 ===> false
		
		return answer == num1+num2;
	}

}

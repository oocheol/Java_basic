package 저금통;

public class PiggyMain {

	public static void main(String[] args) {

		// 실행공간
		// 1. PiggyBank 설계도면을 가지고 bank 객체 생성
		PiggyBank bank = new PiggyBank();
		
		// 2. bank 객체의 이름 필드에 본인 이름을 넣기
		bank.name = "정우철";
		
		// 3. bank 객체의 돈 필드에 돈을 초기화
		bank.money = 10000;
		
	}

}

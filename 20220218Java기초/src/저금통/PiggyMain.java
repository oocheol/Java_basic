package 저금통;

public class PiggyMain {

	public static void main(String[] args) {

		// 실행공간
		// 1. PiggyBank 설계도면을 가지고 bank 객체 생성
		PiggyBank bank = new PiggyBank("정우철", 10000);
		
		// 2. bank 객체의 이름 필드에 본인 이름을 넣기
		// bank.name = "정우철";
		
		// 3. bank 객체의 돈 필드에 돈을 초기화
		// bank.money = 10000;
		
		// 4. 5000원 입금
		bank.deposit(5000);
		
		// 5. 잔액 출력
		bank.showMoney();
		
		// 6. 2500원 출금
		// 메소드는 무조건 소괄호가 존재한다.
		bank.withdraw(2500);
		
		// 7. 잔액 출력
		bank.showMoney();
		
	}

}

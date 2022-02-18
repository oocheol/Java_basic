package 저금통;

public class PiggyBank {

	// 설계도면
	
	// 1. Field(필드)
	// : 속성, 데이터
	// - 이름(name)
	String name;
	// - 돈(money)
	int money;
	
	// 2. Method(메소드)
	// - 돈을 입금하기(deposit) 
	// 매개변수로 정수형 데이터 
	// 리턴타입 없음
	public void deposit(int money) {
		// 필드에 있는 money 매개변수로 받아온 money 누적!
	}
	
	// - 돈을 출금하는(withdraw)
	// 매개변수로 정수형 데이터
	// 리턴타입 없음
	public void withdraw(int money) {
		// 필드에 있는 money를 매개변수로 받아온 money 빼면서 누적!
	}
	// - 잔액을 보여주기(showMoney)
	// 매개변수 없음
	// 리턴타입 없음
	public void showMoney() {
		// 조자연님의 잔액이 ______ 원 있습니다.
	}

}

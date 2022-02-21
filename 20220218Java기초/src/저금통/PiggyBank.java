package 저금통;

public class PiggyBank {

	// 설계도면

	// 1. Field(필드)
	// : 속성, 데이터
	// - 이름(name)
	private String name;
	// - 돈(money)
	private int money;

	// 생성자 단축키
	// alt + shift + s
	// 'Generate Constructor using Field' 선택
	
	public PiggyBank(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

//	public PiggyBank(String name, int money) {
//		this.name = name;
//		this.money = money;
//	}


	// 2. Method(메소드)
	// - 돈을 입금하기(deposit)
	// 매개변수로 정수형 데이터
	// 리턴타입 없음
	public void deposit(int money) {
		if (money > 0) {
			// 필드에 있는 money 매개변수로 받아온 money 누적!
			this.money += money;
		} else {
			System.out.println("잘못된 금액을 입력하셨습니다.");
		}
		// this --> 클래스 설계도면 안에서 나 자신을 지칭하는 키워드!
	}

	// - 돈을 출금하는(withdraw)
	// 매개변수로 정수형 데이터
	// 리턴타입 없음
	public void withdraw(int money) {
		// 필드에 있는 money를 매개변수로 받아온 money 빼면서 누적!
		this.money -= money;
	}

	// - 잔액을 보여주기(showMoney)
	// 매개변수 없음
	// 리턴타입 없음
	public void showMoney() {
		// 조자연님의 잔액이 ______ 원 있습니다. <<ㅡ 출력
		System.out.println(name + "님의 잔액이 " + money + "원 있습니다.");
	}

}

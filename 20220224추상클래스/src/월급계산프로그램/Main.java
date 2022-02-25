package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		// 실행공간
		// Employee ---> abstract 추상클래스
		// 추상클래스는 객체로 만들 수 없다!!
		
		
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003", "김O독", 10, 10);
		
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay());
		
		
	}

}

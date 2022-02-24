package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		// 실행공간
		
		Employee partTime = new PartTimeEmployee("SMHRD003", "김O독", 10, 10);
		
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay());
		
		
	}

}

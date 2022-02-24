package 월급계산프로그램;

public abstract class Employee {

	// 공통의 조상
	private String empno;
	private String name;
	private int pay;

	public abstract int getMoneyPay();

	public String print() {
		return empno + " : " + name + " : " + pay;
	}

}

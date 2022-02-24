package 월급계산프로그램;

public class RegularEmployee extends Employee {

	// 1. 필드
	private int bonus;
	
	// 2. 메소드
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

}

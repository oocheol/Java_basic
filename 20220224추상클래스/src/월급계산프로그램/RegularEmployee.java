package ���ް�����α׷�;

public class RegularEmployee extends Employee {

	// 1. �ʵ�
	private int bonus;
	
	// 2. �޼ҵ�
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

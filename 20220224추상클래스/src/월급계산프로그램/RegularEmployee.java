package ���ް�����α׷�;

public class RegularEmployee extends Employee {

	// 1. �ʵ�
	private int bonus;
	
	// 2. �޼ҵ�
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	
	@Override
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

	

}

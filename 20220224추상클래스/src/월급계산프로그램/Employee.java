package ���ް�����α׷�;

public abstract class Employee {

	// ������ ����
	private String empno;
	private String name;
	private int pay;

	public abstract int getMoneyPay();

	public String print() {
		return empno + " : " + name + " : " + pay;
	}

}

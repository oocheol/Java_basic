package ���ް�����α׷�;

public abstract class Employee {

	// ������ ����
	protected String empno;
	protected String name;
	protected int pay;
	
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();

	public String print() {
		return empno + " : " + name + " : " + pay;
	}

}

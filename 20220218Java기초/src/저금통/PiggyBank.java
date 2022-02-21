package ������;

public class PiggyBank {

	// ���赵��

	// 1. Field(�ʵ�)
	// : �Ӽ�, ������
	// - �̸�(name)
	private String name;
	// - ��(money)
	private int money;

	// ������ ����Ű
	// alt + shift + s
	// 'Generate Constructor using Field' ����
	
	public PiggyBank(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

//	public PiggyBank(String name, int money) {
//		this.name = name;
//		this.money = money;
//	}


	// 2. Method(�޼ҵ�)
	// - ���� �Ա��ϱ�(deposit)
	// �Ű������� ������ ������
	// ����Ÿ�� ����
	public void deposit(int money) {
		if (money > 0) {
			// �ʵ忡 �ִ� money �Ű������� �޾ƿ� money ����!
			this.money += money;
		} else {
			System.out.println("�߸��� �ݾ��� �Է��ϼ̽��ϴ�.");
		}
		// this --> Ŭ���� ���赵�� �ȿ��� �� �ڽ��� ��Ī�ϴ� Ű����!
	}

	// - ���� ����ϴ�(withdraw)
	// �Ű������� ������ ������
	// ����Ÿ�� ����
	public void withdraw(int money) {
		// �ʵ忡 �ִ� money�� �Ű������� �޾ƿ� money ���鼭 ����!
		this.money -= money;
	}

	// - �ܾ��� �����ֱ�(showMoney)
	// �Ű����� ����
	// ����Ÿ�� ����
	public void showMoney() {
		// ���ڿ����� �ܾ��� ______ �� �ֽ��ϴ�. <<�� ���
		System.out.println(name + "���� �ܾ��� " + money + "�� �ֽ��ϴ�.");
	}

}

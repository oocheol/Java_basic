package ������;

public class PiggyMain {

	public static void main(String[] args) {

		// �������
		// 1. PiggyBank ���赵���� ������ bank ��ü ����
		PiggyBank bank = new PiggyBank("����ö", 10000);
		
		// 2. bank ��ü�� �̸� �ʵ忡 ���� �̸��� �ֱ�
		// bank.name = "����ö";
		
		// 3. bank ��ü�� �� �ʵ忡 ���� �ʱ�ȭ
		// bank.money = 10000;
		
		// 4. 5000�� �Ա�
		bank.deposit(5000);
		
		// 5. �ܾ� ���
		bank.showMoney();
		
		// 6. 2500�� ���
		// �޼ҵ�� ������ �Ұ�ȣ�� �����Ѵ�.
		bank.withdraw(2500);
		
		// 7. �ܾ� ���
		bank.showMoney();
		
	}

}

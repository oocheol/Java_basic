package ���ް�����α׷�;

public class Main {

	public static void main(String[] args) {
		// �������
		// Employee ---> abstract �߻�Ŭ����
		// �߻�Ŭ������ ��ü�� ���� �� ����!!
		
		
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003", "��O��", 10, 10);
		
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay());
		
		
	}

}

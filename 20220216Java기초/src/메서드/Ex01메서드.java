package �޼���;

public class Ex01�޼��� {

	public static void main(String[] args) {

		// �Ի�(���)
		System.out.println(3+5);
		System.out.println(12+17);
		System.out.println(33+55);
		System.out.println(123+222);

		// �޼��带 ����ؼ� ���ϴ� ���
		addNumber(3,5);
		addNumber(12,17);
		addNumber(33,55);
		addNumber(123,222);
		
		// 2�� �����ֱ� ���ؼ� � �κ��� �ٲٸ� addNumber�� 2�� ���������?
		// �޼�������� +2
		
	}

	// �޼��� ���� �ۿ��� �ۼ��� �Ǿ�����.
	public static void addNumber(int a, int b) {
		// addNumber = �޼����� �̸�
		// int a, int b �޼��忡�� ����� ���� -> �Ű�����(parameter)
		// �߰�ȣ �ȿ��� �޼��� ������ �ۼ��غ���.
		System.out.println(a+b+2);
	}
	
	
	
}

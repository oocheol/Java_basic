package �޼���;

public class Ex02�����ε� {

	public static void main(String[] args) {

		// �޼ҵ� �����ε� 
		// overloading
		// ���� �̸��� �޼��带 �ߺ��Ͽ� �����ϴ� ���� �ǹ�
		// ���� �̸��� ��������, �Ű������� ������ Ÿ���� �ٸ��� �ϸ�
		// �ϳ��� �̸����� �޼��带 �ۼ��� �� �ִ�.
		
		display(10);
		display(10,2);
		
	}
	
	public static void display(int num1) {
		System.out.println(num1);
	}
	
	public static void display(int num1, int num2) {
		System.out.println(num1+num2);
	}
	

}

package �޼���;

import java.util.Scanner;

public class Ex09�޼���ǽ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();
		System.out.print("������ >> ");
		String op = sc.next(); 
				
		System.out.println(cal(num1, num2, op));

	}

	// ���� : op�� � ���������� �Ǵ�

	public static int cal(int a, int b, String op) {
		System.out.print("��� : ");
		if (op.equals("+")) {
			return a + b;
		} else if (op.equals("-")) {
			return a - b;
		} else if (op.equals("*")) {
			return a * b;
		} else if (op.equals("/")) {
			return a / b;
		}
		return 0;

	}

}

package �޼���;

import java.util.Scanner;

public class Ex08�޼���ǽ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);
		int result1 = largerNumber1(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result1);

	}

	public static int largerNumber(int a, int b) {
		if (a > b) {
			return a;
		} else if (a < b) {
			return b;
		} else {
			return 0;
		}
		// else if���� ����ϰ� �ȴٸ� else������ �ݾ�
		// ��� ��쿡 ���� return ���� ��������� �Ѵ�.
	}

	// ���׿�����
	public static int largerNumber1(int a, int b) {
		return a > b ? a : b;
	}

}

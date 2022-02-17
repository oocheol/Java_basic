package �޼���;

public class Ex01������ {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 3;

		// ��� : � ���� ������ �������� �ϴ� ��
		// num1�� num2�� ������ �� ������ ����������
		// num1�� num2�� �������
		// num2�� num1�� �������
		boolean result = isDivisor(num1, num2);
		System.out.println(result);

		// is�� ���� �޼��� -> ������� boolean �Ҹ���

		System.out.println("============");

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);

		System.out.println("============");

		int num = 10;
		int result1 = getSumOfDivisors(num);

		System.out.println(num + "�� ����� �� : " + result1);

		getDivisor(num);

		System.out.println("============");

		// ������ : �ڱ��ڽ��� ������ ������� ���� == �ڱ��ڽ�
		// 6�� ���
		// : 1 2 3 == 6 (������ O)
		// 10�� ���
		// : 1 2 5 == 10 (������ X)

		int num3 = 8196;
		boolean result3 = isPerfectNumber(num3);
		System.out.println("������ : " + result3);

		System.out.println("============");

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int start, int end) {
		String result = "";
		result += start + "~" + end + "������ ������ : ";
		for (int i = start; i <= end; i++) {
			if (isPerfectNumber(i)) {
				result += i + " ";
			}
		}
		System.out.println(result);

	}

	public static boolean isPerfectNumber(int num) {
		int temp = getSumOfDivisors(num) - num;
		if (temp == num) {
			return true;
		}
		return false;

	}

	public static int getSumOfDivisors(int num) {
		// ������Ҷ� �ڱ� ���� ���� for���� num/2���� ������
		// num/2 ~ num���� ��������� ���� �� ����
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum + num;
	}

	public static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		}
		return false;
	}

	public static void getDivisor(int num) {
		System.out.print(num + "�� ��� : ");
		String result = "";
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				result += i + " ";
			}
		}
		System.out.println(result);
	}

}

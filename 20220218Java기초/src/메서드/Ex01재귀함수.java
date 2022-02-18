package �޼���;

public class Ex01����Լ� {

	public static void main(String[] args) {

		// �ڿ��� �����ϴ� �Ǻ���ġ����
		// ����
		// 2 4 6 8 10 > ��������(�����ϰ� ����)
		// 2 4 8 16 32 > ������(����� ������ ����)
		// �Ǻ���ġ����
		// 1 1 2 3 5 8 13 21 34 55
		// (n-2) + (n-1) = n --> ��(�ε���)
		// �տ� �� ���� �����Ǿ��ִ�. (1�� 1�� ������ �Ǿ��ִ�.)

		int num = 10;
		int result = fibonacci(num);
		System.out.println("�Ǻ���ġ ������ " + num + "��° ����" + result + "�Դϴ�.");

	}

	// ����Լ�
	// �ڱ� �ڽ��� ȣ���ϴ� �Լ�
	public static int fibonacci_1(int num) {
		// �Ǻ���ġ ������ ���� �迭�� ����
		int[] fibo = new int[num];
		
		// ù��° �װ� �ι�° �� �̸� ����
		fibo[0] = 1;
		fibo[1] = 1;
		
		for(int i = 2; i<fibo.length;i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		return fibo[num-1];
		
	}

	public static int fibonacci(int num) {
		int result = 0;

		// 1��°, 2��° ���� 1�� ����
		if (num == 1) {
			result = 1;
		} else if (num == 2) {
			result = 1;
		} else {
			// 2��° ~~~ (num - 2) + (num - 1) = num
			result = fibonacci(num - 1) + fibonacci(num - 2);

		}

		return result;
	}

}

package �迭;

public class Ex01�迭 {

	public static void main(String[] args) {

		// �ڷᱸ�� : �뷮�� �����͸� ȿ�������� �����ϱ� ���� ��Ŀ����
		// Queue, Array, Stack, List, Tree

		// �迭 : ���� Ÿ���� �����͸� �ս��� �����ϱ� ���� �� �� �ִ� ���(�ڷ� ����)

		// 1. �迭�� ����
		// �ڷ���[] �迭�� = new �ڷ���[�迭�� ũ��];
		// [] -> �迭�� ����ϰڴ�. �迭�� ǥ��

		// ���۷��� ����
		String[] cgi;
		cgi = new String[3];

//		String[] cgi = new String[3];

		// 2. �迭�� ������ ����
		cgi[0] = "������";
		cgi[1] = "����";
		cgi[2] = "���ڿ�";
		// �������� �ִ� �ε��� �� = �迭�� ũ�� -1
//		cgi[3] = "�赿��";

		// ���۷��� ����(cgi) : �迭�� ��� ����Ǿ� �ִ��� �ּҰ�, ������
		// [Ljava.lang.String;@1c4af82c
		System.out.println(cgi);

		// 3. �迭�� ������ Ȯ��
		System.out.println(cgi[0]);
		System.out.println(cgi[1]);
		System.out.println(cgi[2]);

		// �ݺ��� for�� Ȱ��
		// �迭�� �����͵� �����ϱ�

		for (int i = 0; i < cgi.length; i++) {
			System.out.println(cgi[i]);
		}

		// �迭 ���� ũ�⿡ �ѹ��� �����ϴ� ���
		// length
		// �������� �ִ� �ε��� �� = �迭�� ũ�� -1
		// �������� �ִ� �ε��� �� = cgi.length -1

		// �迭�� ����� �ٸ� ���
//		int[] array = {0,1,2,3,4};

		// �������� �迭 array �����ϱ�!
		// ������ ���� ������ �ʱ�ȭ �ϱ�
		// 3, 10, 4, 8, 17, 22, 31
		// �ݺ����� ����ؼ� �����͵鿡 ����
		// ¦���� �ش��ϴ� ���鸸 ����ϱ�
		int[] array = { 3, 10, 4, 8, 17, 22, 31 };
		for (int i = 0; i < array.length; i++) {
			// array[i] <= ¦������ �ƴ��� �Ǻ�
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}

		// ����!!!!
		// Ȧ���� �ش��ϴ� ����� �� ��� �ִ��� ����ϱ�!
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			// array[i] <= Ȧ������ �ƴ��� �Ǻ�
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);
				count++;
			}
		}
		System.out.println("Ȧ�� ���� : " + count);

	}
}

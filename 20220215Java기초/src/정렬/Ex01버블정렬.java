package ����;

import java.util.Arrays;

public class Ex01�������� {

	public static void main(String[] args) {

		// ������ �迭�� ����
		int[] arr = { 45, 7, 12, 82, 25, 13, 5, 38 };

		// ��������
		// -> ������ ���ҵ鳢�� ���ؼ� ����!

		// �������� ����
		// 7, 12, 25, 45, 82

		// 1Step
		// 1) 0�� �ε����� ���� 1�� �ε����� ������ ū�� ��
		if (arr[0] > arr[1]) {
			// 2) ���࿡ �� ũ�ٸ� 0�� �ε����� ���� 1�� �ε����� ���� ���� ��ȯ (���̾��� ��)
			int temp = arr[1]; // 7
			arr[1] = arr[0]; // 45, 45, 12, 82, 25
			arr[0] = temp;
			// ---> ġȯ�� ����

		}

		// 3) �迭 �ȿ� �ִ� �����͸� ���� ���!
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		// Arrays.toString(�迭�� �̸�)
		System.out.println(Arrays.toString(arr));

		// 4) 1������ �����Ϳ� 2������ ������ ���� ���ؼ� ġȯ

		// 5) 2������ �����Ϳ� 3������ ������ ���� ���ؼ� ġȯ

		// 6) 3������ �����Ϳ� 4������ ������ ���� ���ؼ� ġȯ
		for (int j = arr.length-1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;

				}
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println("���� �� : " + Arrays.toString(arr));

	}

}

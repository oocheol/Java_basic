package �迭;

import java.util.Scanner;

public class Ex02�迭 {

	public static void main(String[] args) {

		// �迭�� ��ĳ�ʷ� �Է¹��� ���� �����ϱ�!
		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);

		// 2. �迭�� ����
		int[] arr = new int[5];

//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		arr[2] = sc.nextInt();
//		arr[3] = sc.nextInt();
//		arr[4] = sc.nextInt();

		// �Էº�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// ��º�
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}

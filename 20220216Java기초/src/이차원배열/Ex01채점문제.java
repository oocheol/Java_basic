package �������迭;

import java.util.Scanner;

public class Ex01ä������ {

	public static void main(String[] args) {

		// ��, �Է��� ��, ����
		// : 1���� ������ ���� ���� ������ -> ������ ��
		// : 2���� �츮�� ���� �Է��Ұſ��� -> �Է��� ��
		// : 3���� ������ ���� ���� ������ -> �ش繮���� ���� ����

		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);

		// 2. �迭 ���� �� ����
		// 2�࿡���ؼ��� �̸� �ʱ�ȭ -----> �Է�
		int[][] answer = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 40, 50 } };

		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "���� >>");
			answer[1][i] = sc.nextInt();
		}
		System.out.println("����Ȯ��");

		int score = 0;
		for (int i = 0; i < 5; i++) {
			if (answer[0][i] == answer[1][i]) {
				System.out.print("O ");
				score += answer[2][i];
			} else {
				System.out.print("X ");
			}
		}
		System.out.println();
		System.out.println("���� : " + score);

	}

}

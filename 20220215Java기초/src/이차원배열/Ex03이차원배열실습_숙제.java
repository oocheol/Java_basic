package �������迭;

import java.util.Scanner;

public class Ex03�������迭�ǽ�_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][5];

		// ����
		arr[0][0] = 1;
		arr[0][1] = 4;
		arr[0][2] = 3;
		arr[0][3] = 2;
		arr[0][4] = 1;
		
		// ���׺� ����
		arr[2][0] = 10;
		arr[2][1] = 20;
		arr[2][2] = 30;
		arr[2][3] = 40;
		arr[2][4] = 50;
		
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		for (int i = 0; i<5;i++) {
			System.out.print((i+1)+"���� >>");
			arr[1][i] = sc.nextInt(); 
		}
		System.out.println("����Ȯ��");
		
		int score = 0;
		for (int i = 0; i<5;i++) {
			if (arr[0][i] == arr[1][i]) {
				System.out.print("O ");
				score += arr[2][i];
			} else {
				System.out.print("X ");
			}
		}
		System.out.println("���� : "+score);
		
	}

}

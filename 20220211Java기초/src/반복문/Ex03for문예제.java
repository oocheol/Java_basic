package �ݺ���;

import java.util.Scanner;

public class Ex03for������ {

	public static void main(String[] args) {

		// 1. 1 ~ 100���� �� 3�� ����� ����ϼ���.
//		for (int i=1; i<=100;i++) {
//			if(i%3==0) {
//				System.out.println(i);
//			}
//		}
		
		// 2. 1 ~ 100���� �� 3�� ����̸鼭 5�� ����� ����ϼ���.
//		for (int i=1; i<=100; i++) {
//			if((i%3==0) && (i%5==0)) {
//				System.out.println(i);
//			}
//		}
		
		// 3. �� ���� �ڿ����� �Է¹޾� �� ���� ����� ���ʷ� 10�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();
		
		for (int i=1; i <=10;i++) {
			System.out.println(i*num);
		}
		
		
		
		
		
		
		
	}

}

package �ݺ�������;

import java.util.Scanner;

public class Ex01for�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. �ܼ� �Է�
		System.out.println("�ܼ��Է� : ");
		int dan = sc.nextInt();
		
		// 2. ��� ������ ����� ���� �Է�
		System.out.println("��� ������ ��� : ");
		int num = sc.nextInt();
		
		System.out.println(dan + "��");
		for (int i=1;i<=num;i++) {
		
			System.out.println(dan+"*"+i+"="+(dan*i));
			
		}
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}

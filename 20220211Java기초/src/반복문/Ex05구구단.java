package �ݺ���;

import java.util.Scanner;

public class Ex05������ {

	public static void main(String[] args) {

		// for���� ����ؼ� ������ 2���� ����غ���.
		
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// 2 * 4 = 8
		// 2 * 5 = 10
		
//		for (int i=1;i<=9;i++) {
//			System.out.println(2+" * "+i+" = "+(2*i));
//		}
		
		// ����� ����Ҳ��� �Է�
		// �Է¹��� ������ ���� �������� ����غ���.
		
		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		// 2. ������ �Է� (������ ���������.)
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();
		// 3. �Է¹��� ������ ���� �������� �ݺ����� ����ؼ� ����غ���
		for (int i=1;i<=9;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
		
	}

}

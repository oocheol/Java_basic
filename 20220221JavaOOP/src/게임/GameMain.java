package ����;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pokemon pairi = new Pokemon("��", "���̸�", 1000, "ȭ�����", 100);
		Pokemon kkobuk = new Pokemon("��", "���α�", 1500, "������", 200);
		
		// ���̸��� ��ų�� ������ּ���.
		// System.out.println(pairi.getSkill());
		
		System.out.println("======���ϸ��� �����ϼ���======");
		System.out.println("[1]���̸� [2]���α�");
		// ����ڷκ��� �Է¹ޱ�
		int input = sc.nextInt();
		if(input == 1) {
			
			System.out.println("[1]�Ϲݰ��� [2]��ų");
			// ����ڷκ��� �Է¹ޱ�
			int input2 = sc.nextInt();
			
		} else if(input == 2){
			
			System.out.println("[1]�Ϲݰ��� [2]��ų");
			// ����ڷκ��� �Է¹ޱ�
			int input2 = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

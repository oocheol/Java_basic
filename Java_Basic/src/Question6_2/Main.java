package Question6_2;

import java.util.ArrayList;
import java.util.Scanner;

import Question6_1.MusicVO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		
		boolean stop = true;
		
		while(stop) {
		System.out.print("[1]���������� [2]�̿�Ǻ��� [3]�󼼺��� [4]�������� [5]���� >> ");
		int input = sc.nextInt();
		switch(input) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			stop = false;
			break;
		default:
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
			} 
		}
		
	}

}

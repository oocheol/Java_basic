package Java_Festival;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex29 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		while (true) {
			if (num < 10) {
				arr.add(num);
				break;
			}
			arr.add(num % 10);
			num /= 10;

		}
//		0123456789
//		6255456376
		int result = 0;
		for (int i = 0; i < arr.size(); i++) {
			switch (arr.get(i)) {
			case 0:
				result += 6;
				break;
			case 1:
				result += 2;
				break;
			case 2:
				result += 5;
				break;
			case 3:
				result += 5;
				break;
			case 4:
				result += 4;
				break;
			case 5:
				result += 5;
				break;
			case 6:
				result += 6;
				break;
			case 7:
				result += 3;
				break;
			case 8:
				result += 7;
				break;
			case 9:
				result += 6;
				break;
			}

		}

		System.out.print("���('-')�� �� �� >> ");
		System.out.println(result);

	}

}

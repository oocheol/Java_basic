package Java_Festival;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex16 {

	public static void main(String args[]) {

		// 10진수 -> 2진수

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();

		int remain = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();

		while (true) {
			remain = num % 2;
			arrayList.add(remain);

			num /= 2;

			if (num == 0) {
				break;
			}
		}
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			System.out.print(arrayList.get(i) + " ");
		}

	}

}

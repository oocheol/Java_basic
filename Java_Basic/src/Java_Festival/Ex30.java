package Java_Festival;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex30 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();

		int temp = num2;
		while (true) {
			if (temp < 10) {
				arr.add(temp);
				break;
			}
			arr.add(temp % 10);
			temp /= 10;
		}

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(num1 * arr.get(i));
		}
		System.out.println(num1 * num2);

	}

}

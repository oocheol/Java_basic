package Java_Festival;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex24 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();

		while (true) {
			if (num <= 0) {
				break;
			}

			arr.add(num % 10);
			num /= 10;
		}

		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		System.out.println("합은 " + sum + "입니다.");

	}

}

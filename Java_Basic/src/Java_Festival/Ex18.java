package Java_Festival;

import java.util.Scanner;

public class Ex18 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번 째 정수 입력>>");
			int num = sc.nextInt();

			if (num % 3 == 0) {
				arr[i] = num;
			}
		}

		System.out.print("3의 배수 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}

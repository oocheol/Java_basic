package Java_Festival;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex26 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < arr.length - 1; j++) {
			int minIndex = j;

			for (int i = j; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;

		}

		System.out.println("정렬 후");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

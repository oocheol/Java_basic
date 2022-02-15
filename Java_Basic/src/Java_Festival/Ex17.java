package Java_Festival;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex17 {

	public static void main(String args[]) {

		int[] arr = new int[8];
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			int num = ran.nextInt(100) + 1;
			arr[i] = num;

		}
//		System.out.println(Arrays.toString(arr));
		System.out.print("배열에 있는 모든 값 : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("가장 큰 값 : ");
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

		System.out.print("가장 작은 값 : ");
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}

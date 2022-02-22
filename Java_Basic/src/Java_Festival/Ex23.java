package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex23 {

	public static void main(String args[]) {

		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] += num;
				num++;

			}
		}

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			} else {
				for (int j = 4; j >= 0; j--) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		}

	}

}

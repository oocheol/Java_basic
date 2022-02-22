package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex25 {

	public static void main(String args[]) {
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int distant = point[0] - point[1];
		int index1 = 0;
		int index2 = 0;

		for (int i = 0; i < point.length; i++) {
			for (int j = 1; j < point.length; j++) {
				if (point[i] > point[j] && point[i] - point[j] <= distant) {
					index1 = i;
					index2 = j;
					distant = point[i] - point[j];
				} else if (point[i] < point[j] && point[j] - point[i] <= distant) {
					index1 = j;
					index2 = i;
					distant = point[j] - point[i];
				}
			}
		}
		System.out.println("result = [" + index1 + ", " + index2 + "]");

	}

}

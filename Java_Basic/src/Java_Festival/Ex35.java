package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex35 {

	public static void main(String args[]) {

		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("��� Ȯ�� : " + result);

	}

	public static int powerN(int base, int n) {
		int result = base;
		for (int i = 1; i < n; i++) {
			result *= base;
		}
		return result;
	}

}

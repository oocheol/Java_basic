package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex36 {

	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);

		System.out.println("결과 확인 : " + result);
	}

	public static boolean isDivide(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		}
		return false;
	}

}

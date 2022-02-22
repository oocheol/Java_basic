package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex34 {

	public static void main(String args[]) {

		int num1 = 50;
		int num2 = 15;
		String op = "*";
		
		System.out.println(cal(num1, num2, op));
		
	}

	public static int cal(int a, int b, String op) {
		if (op.equals("+")) {
			return a + b;
		} else if (op.equals("-")) {
			return a - b;
		} else if (op.equals("*")) {
			return a * b;
		} else if (op.equals("/")) {
			return a / b;
		}
		return 0;

	}

}

package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex32 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("2진수 입력");
		
		String str = sc.next();
		String[] arr = str.split("");

		int result = 0;
		int add = 1;

		if (arr[arr.length - 1].equals("1")) {
			result += 1;
		}
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i].equals("1")) {
				add *= 2;
				result += add;
			} else {
				add *= 2;
			}

		}

		System.out.print(str + "(2) = ");
		System.out.println(result + "(10)");

	}

}

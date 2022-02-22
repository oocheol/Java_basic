package Java_Festival;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex31 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 채점하기 ====");

		String str = sc.next();
		String[] arr = str.split("");

		int result = 0;
		int add = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("o")) {
				result += add;
				add++;
			} else {
				add = 1;
			}
		}
		System.out.println(result);

	}

}

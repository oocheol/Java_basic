package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex33 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ���ĺ� �󵵼� ���ϱ� ====");

		System.out.print("�Է�>> ");
		String str = sc.nextLine();
		str = str.toLowerCase();

		for (int j = 'a'; j <= 'z'; j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == j) {
					count++;
				}
			}
			System.out.println((char) j + " : " + count);
		}

	}

}

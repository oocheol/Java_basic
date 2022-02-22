package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex37 {

	public static void main(String args[]) {
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

	}

	public static String getMiddle(String str) {
		int mid = str.length() / 2;
		if (str.length() % 2 == 0) {
			return str.substring(mid - 1, mid + 1);
		} else {
			return str.substring(mid, mid + 1);
		}
	}

}

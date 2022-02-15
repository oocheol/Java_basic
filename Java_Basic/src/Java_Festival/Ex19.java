package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex19 {

	public static void main(String args[]) {

		Random ran = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.println("행운의 숫자 : " + lotto[i]);
		}

	}

}

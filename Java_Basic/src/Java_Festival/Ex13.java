package Java_Festival;

import java.util.Scanner;

public class Ex13 {

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			int temp = num%10;
			int result = 0;
			if (temp <5) {
				result = num - temp;
			} else {
				result = num - temp + 10;
			}
			
			System.out.print("반올림수 : " + result);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}


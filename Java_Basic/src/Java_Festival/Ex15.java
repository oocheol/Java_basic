package Java_Festival;

import java.util.Scanner;

public class Ex15 {

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			int num = sc.nextInt();
			
			int result = 1;
			for (int i=1;i<=num;i++) {
				result *=i;
			}
			
			System.out.println("출력 : " + result);
			
			
			
			
			
			
			
			
		}

}


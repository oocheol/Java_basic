package Java_Festival;

import java.util.Scanner;

public class Ex11 {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("?? ???? : ");
			int num = sc.nextInt();
			
			for (int i=1;i<=num;i++) {
				for (int j=0;j<=num-i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			}

}


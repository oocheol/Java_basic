package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String args[]) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int life = 5;
		
		while (life>=1) {
			
			int num1 = ran.nextInt(10);
			int num2 = ran.nextInt(10);
			int answer = num1 + num2;
			
			System.out.print(num1 +" + "+ num2+" = ");
			int input_num = sc.nextInt();
			
			if (input_num == answer) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				life -= 1;
			}
			
			
		
			
		}
		System.out.println("GAME OVER!");
			
		
		
		
		
		
		
		
		
		
		
		}

}



package 반복문;

import java.util.Scanner;

public class Ex06약수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.print(num + "의 약수 : ");
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
		
		
		
	}

}

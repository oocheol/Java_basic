package 반복문복습;

import java.util.Scanner;

public class Ex01for문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 단수 입력
		System.out.println("단수입력 : ");
		int dan = sc.nextInt();
		
		// 2. 어느 수까지 출력할 건지 입력
		System.out.println("어느 수까지 출력 : ");
		int num = sc.nextInt();
		
		System.out.println(dan + "단");
		for (int i=1;i<=num;i++) {
		
			System.out.println(dan+"*"+i+"="+(dan*i));
			
		}
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}

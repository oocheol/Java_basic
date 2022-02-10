package 조건문;

import java.util.Scanner;

public class Ex06ifelse문실습_W {

	public static void main(String[] args) {

		System.out.println("====에버랜드에 오신 걸 환영합니다!=======");
		int price = 5000;
		
		System.out.println("나이를 말씀해주세요");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age<20) {
			price *= 0.5;
		}
		
		System.out.println("인원수를 말씀해주세요");
		int num = sc.nextInt();
		
		
		int result = num * price;
		System.out.println("총 "+ result +"원 입니다.");
		
		
		
		
		
		
		
	}

}

package 조건문;

import java.util.Scanner;

public class Ex04if문예제 {

	public static void main(String[] args) {

		// 입력한 정수가 3의 배수이면서 5의 배수 (이 두가지를 만족시키면)
		// "3의 배수이면서 5의 배수입니다."
		
		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 2. num에 입력받은 정수 저장
		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();
		
		// 3. num이 3의 배수이려면 , num % 3 == 0
		// num이 5의 배수이려면, num % 5 == 0
		// AND 연산자 ----> true && true ===> ture라는 결과값
		// 조건식 : num이 3의 배수도 되고, 5의 배수도 되는지 판단
		// 실행코드 : "3의 배수이면서 5의 배수입니다."
		if (num%3==0 && num%5==0) {
			System.out.println("3의 배수이면서 5의 배수입니다.");
		}
		
		
		
	}

}

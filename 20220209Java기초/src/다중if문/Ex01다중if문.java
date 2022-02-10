package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {

	public static void main(String[] args) {

		// 조건이 여러개였을 때 사용하는 다중if문!
		// if, else if 키워드 기억하기!!!
		
		// 사용자로부터 숫자를 입력받아서 해당하는 숫자가
		// 0인지, 홀수인지, 짝수인지 판단하는 프로그램을 만들어보자!
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 숫자를 입력하세요 출력하기
		System.out.print("숫자를 입력하세요 >> ");
		// 3. 숫자를 입력받기
		int num = sc.nextInt();
		// 4. 조건을 판단해서 0인지, 홀수인지, 짝수인지 출력!
		// **** 조건식의 순서도 생각해보자!!!! *****
		if (num == 0) {
			System.out.println("0입니다!");
		} else if (num % 2 == 1) {
			System.out.println("홀수입니다!");
		} else{
			// 위에 있는 모든 조건식이 거짓이라면 실행하는 구문!
			System.out.println("짝수입니다!");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

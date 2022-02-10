package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {
		
		// Q. 
		// num1 = 2, num2 = 5 -> num1 - num2 = -3
		// 나에게 돌려줄 때는 (최종적인 결과값) == 3
		// num2 - num1 = 3
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 출력문
		System.out.print("첫 번째 정수 입력 >> ");
		
		// 3. 입력
		int num1 = sc.nextInt();
		
		// 4. 출력문
		System.out.print("두 번째 정수 입력 >> ");
		
		// 5. 입력
		int num2 = sc.nextInt();
		
		// 6. 더 큰수를 판별 결과값 도출하기
		int result = (num1 > num2)? num1 - num2 : num2 - num1; 
		// 7. 출력
		System.out.println("결과확인 >> " + result);
		
		
	}

}

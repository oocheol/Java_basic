package 반복문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

		// 1. 입력하는 도구 가지고오기
		Scanner sc = new Scanner(System.in);
		
		// 2. while문 : 조건식, 실행코드
		// 조건 : 내가 입력한 숫자가 10보다 작을때
		// 		 반복을 해줄거에요
		// 실행코드 : 정수입력 : ________;
		
		// 조건식 : 내가 입력한 정수가 10보다 작다면 계속해서 반복
		
		// while문은 반복하는 횟수가 정해져있지 않을때 사용합니다.
//		int num = 0;
//		
//		while(num < 10) {
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//		}
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			// num이 10보다 큰지를 판단 ---> 조건문
			if (num > 10) {
				break;
			}
		}
		
		// 3. 반복문을 탈출하고나면
		// 출력문 작성하기 ( "종료되었습니다." )
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
		
	}

}

package 반복문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {

		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 1) 조건식 : num != -1 (-1이 아니면 계속 반복해주자)
//		int num = 0;
//		int sum = 0;
//		while(num != -1) {
//			System.out.print("숫자 입력: ");
//			num = sc.nextInt();
//			sum += num;
//			System.out.println("누적결과: "+sum);
//		}
		
		int sum = 0;
		while (true) {
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			sum += num;
			System.out.println("누적결과: "+sum);
			
			if (num == -1) {
				break;
			}
			
		}
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
		
		
	}

}

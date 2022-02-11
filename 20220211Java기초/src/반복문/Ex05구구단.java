package 반복문;

import java.util.Scanner;

public class Ex05구구단 {

	public static void main(String[] args) {

		// for문을 사용해서 구구단 2단을 출력해보자.
		
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// 2 * 4 = 8
		// 2 * 5 = 10
		
//		for (int i=1;i<=9;i++) {
//			System.out.println(2+" * "+i+" = "+(2*i));
//		}
		
		// 몇단을 출력할껀지 입력
		// 입력받은 정수에 대한 구구단을 출력해보자.
		
		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수를 입력 (변수를 만들어주자.)
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		// 3. 입력받은 정수에 대한 구구단을 반복문을 사용해서 출력해보자
		for (int i=1;i<=9;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
		
	}

}

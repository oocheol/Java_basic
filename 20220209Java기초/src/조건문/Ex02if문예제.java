package 조건문;

import java.util.Scanner;

public class Ex02if문예제 {

	public static void main(String[] args) {

		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 나이를 입력받기
		// 키보드로 입력받은 값을 age 변수에 저장
		System.out.print("나이를 입력해주세요>> ");
		int age = sc.nextInt(); 
		
		// 조건문
		// 조건식 : 성인이라면(age 20이상)
		// 실행문장 : 조건을 만족한다면 "성인입니다." 문자열 출력
		if (age >= 20) {
			System.out.println("성인입니다.");
		}
		
		
	}

}

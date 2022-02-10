package 조건문;

import java.util.Scanner;

public class Ex05ifelse문 {

	public static void main(String[] args) {
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// java에서 자동완성 단축키 ctrl + space
		
		System.out.print("점수를 입력하세요 >> ");
		
		// 2. 정수형 데이터를 변수 grade에 입력받기
		int grade = sc.nextInt();
		
		// 3. grade가 60점 이상이라면(조건 판단)
		if (grade >= 60) {
			// 4. 합격입니다. 출력
			// 조건식이 true였을 때 실행되는 구문
			System.out.println("합격입니다");
		}
		else {
			// 5. 그렇지 않은 경우(양자택일의 상황)
			// 불합격입니다. 출력
			// 조건식이 false였을 때 실행되는 구문
			System.out.println("불합격입니다.");
		}
		
	}

}

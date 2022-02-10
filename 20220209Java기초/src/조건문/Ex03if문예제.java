package 조건문;

import java.util.Scanner;

public class Ex03if문예제 {

	public static void main(String[] args) {

		// 정보처리기사 점수 60점 이상 "합격입니다"
		// 점수는 입력받아서 60점 이상인지 판별
		
		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 2. score라는 곳에 내가 입력한 점수 저장하기
		System.out.print("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		
		// 3. 조건문
		// 조건식 : score 60점 이상
		// 실행코드 : "합격입니다."
		if (score >= 60) {
			System.out.println("합격입니다.");
		}
		
		
		
	}

}

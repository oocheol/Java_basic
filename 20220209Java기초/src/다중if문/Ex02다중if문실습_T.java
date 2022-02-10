package 다중if문;

import java.util.Scanner;

public class Ex02다중if문실습_T {

	public static void main(String[] args) {
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 점수 입력 : 출력
		System.out.print("점수 입력 : ");
		// 3. 숫자데이터 입력
		int totalScore = sc.nextInt();
		// 4. 학점 계산
		char grade = 'A';
		// 조건 - 90점 이상 : A
		if (totalScore >= 90) {
			grade = 'A';
		} else if (totalScore >= 80) {
			// 80점 이상 90점 미만 : B
			grade = 'B';
		} else if (totalScore >= 70) {
			// 70점 이상 80점 미만 : C
			grade = 'C';
		} else {
			// 70점 미만 : D
			grade = 'D';
		}
		System.out.println(grade + "학점입니다!");
		
		
		
		
		
		
		
		
	}

}

package switch문;

import java.util.Scanner;

public class Ex02switch실습2_T {

	public static void main(String[] args) {
		// 1. 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 점수입력 출력하기
		System.out.print("점수 입력 : ");
		// 3. 점수입력받기
		int totalScore = sc.nextInt();

		// 4. 학점계산하기
		// 조건 - 90점 이상 A
		// 80점 이상 90점 미만 B
		// 70점 이상 80점 미만 C
		// 70점 미만 D
		char grade = 'A';
		switch (totalScore / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break; // 정렬 맞춰주는 단축키 --> ctrl + shift + f
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';

		}

		// alt 누르면서 화살표 이동하면 코드 이동 가능~
		// ctrl + alt 누르면서 화살표 이동하면 코드 복사 가능~
		System.out.println(grade + "학점입니다!");
		
	}

}

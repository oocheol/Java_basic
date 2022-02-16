package 이차원배열;

import java.util.Scanner;

public class Ex01채점문제 {

	public static void main(String[] args) {

		// 답, 입력한 답, 배점
		// : 1행은 정해진 값이 들어가게 만들자 -> 정해진 답
		// : 2행은 우리가 답을 입력할거에요 -> 입력한 답
		// : 3행은 정해진 값이 들어가게 만들자 -> 해당문제에 대한 점수

		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);

		// 2. 배열 선언 및 생성
		// 2행에대해서는 미리 초기화 -----> 입력
		int[][] answer = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 40, 50 } };

		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번답 >>");
			answer[1][i] = sc.nextInt();
		}
		System.out.println("정답확인");

		int score = 0;
		for (int i = 0; i < 5; i++) {
			if (answer[0][i] == answer[1][i]) {
				System.out.print("O ");
				score += answer[2][i];
			} else {
				System.out.print("X ");
			}
		}
		System.out.println();
		System.out.println("총점 : " + score);

	}

}

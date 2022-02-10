package switch문;

import java.util.Scanner;

public class Ex02switch실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();

		char grade = 'A';
		switch (totalScore / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';

		}
		System.out.println(grade + "학점입니다!");
	}

}

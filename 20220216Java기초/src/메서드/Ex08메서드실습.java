package 메서드;

import java.util.Scanner;

public class Ex08메서드실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);
		int result1 = largerNumber1(num1, num2);
		System.out.println("큰 수 확인 : " + result1);

	}

	public static int largerNumber(int a, int b) {
		if (a > b) {
			return a;
		} else if (a < b) {
			return b;
		} else {
			return 0;
		}
		// else if문을 사용하게 된다면 else문으로 닫아
		// 모든 경우에 대한 return 값을 설정해줘야 한다.
	}

	// 삼항연산자
	public static int largerNumber1(int a, int b) {
		return a > b ? a : b;
	}

}

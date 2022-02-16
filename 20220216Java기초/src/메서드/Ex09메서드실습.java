package 메서드;

import java.util.Scanner;

public class Ex09메서드실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();
		System.out.print("연산자 >> ");
		String op = sc.next(); 
				
		System.out.println(cal(num1, num2, op));

	}

	// 로직 : op가 어떤 연산자인지 판단

	public static int cal(int a, int b, String op) {
		System.out.print("결과 : ");
		if (op.equals("+")) {
			return a + b;
		} else if (op.equals("-")) {
			return a - b;
		} else if (op.equals("*")) {
			return a * b;
		} else if (op.equals("/")) {
			return a / b;
		}
		return 0;

	}

}

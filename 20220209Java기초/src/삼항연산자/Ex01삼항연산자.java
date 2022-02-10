package 삼항연산자;

public class Ex01삼항연산자 {

	public static void main(String[] args) {
		
		// 조건식
		// 삼항연산자 구조
		// 연산자(조건식) ? true : false;
		
		// 1. 정수형 num 2숫자 데이터 넣기!
		int num = 2;
		
		// 2. num 숫자가 짝수인지 홀수인지 판별!
		// num % 2 == 0 : 짝수
		String result = num % 2 == 0? "짝수입니다" : "홀수입니다";
		System.out.println(result);
		
		
	}
	
}

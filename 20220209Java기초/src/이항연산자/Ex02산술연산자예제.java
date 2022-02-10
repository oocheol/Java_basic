package 이항연산자;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		
		// Q. 456의 백의자리 숫자를 구해보자
		// 1. 정수형 num 456 값을 넣어주자
		int num = 456;
		
		// 2. num의 백의자리 이하는 버리기
		int result = num / 100; // 4
		int result1 = (num - (num % 100)) / 100;
		
		// 3. 결과 출력 ----> 4가 나오도록 연산하기
		System.out.println("결과 출력 >> " + result);
		System.out.println("결과 출력 >> " + result1);
		
		
		
		
		
	}

}

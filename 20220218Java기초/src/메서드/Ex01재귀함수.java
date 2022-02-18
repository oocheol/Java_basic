package 메서드;

public class Ex01재귀함수 {

	public static void main(String[] args) {

		// 자연상에 존재하는 피보나치수열
		// 수열
		// 2 4 6 8 10 > 등차수열(동등하게 증가)
		// 2 4 8 16 32 > 등비수열(등등한 비율로 증가)
		// 피보나치수열
		// 1 1 2 3 5 8 13 21 34 55
		// (n-2) + (n-1) = n --> 항(인덱스)
		// 앞에 두 수는 고정되어있다. (1과 1은 고정이 되어있다.)

		int num = 10;
		int result = fibonacci(num);
		System.out.println("피보나치 수열의 " + num + "번째 항은" + result + "입니다.");

	}

	// 재귀함수
	// 자기 자신을 호출하는 함수
	public static int fibonacci_1(int num) {
		// 피보나치 수열을 담을 배열을 선언
		int[] fibo = new int[num];
		
		// 첫번째 항과 두번째 항 미리 선언
		fibo[0] = 1;
		fibo[1] = 1;
		
		for(int i = 2; i<fibo.length;i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		return fibo[num-1];
		
	}

	public static int fibonacci(int num) {
		int result = 0;

		// 1번째, 2번째 항은 1로 고정
		if (num == 1) {
			result = 1;
		} else if (num == 2) {
			result = 1;
		} else {
			// 2번째 ~~~ (num - 2) + (num - 1) = num
			result = fibonacci(num - 1) + fibonacci(num - 2);

		}

		return result;
	}

}

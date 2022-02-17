package 메서드;

public class Ex01완전수 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 3;

		// 약수 : 어떤 수를 나누어 떨어지게 하는 수
		// num1을 num2로 나눴을 때 나누어 떨어지는지
		// num1이 num2의 약수인지
		// num2가 num1의 배수인지
		boolean result = isDivisor(num1, num2);
		System.out.println(result);

		// is가 붙은 메서드 -> 결과값이 boolean 불리언

		System.out.println("============");

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);

		System.out.println("============");

		int num = 10;
		int result1 = getSumOfDivisors(num);

		System.out.println(num + "의 약수의 합 : " + result1);

		getDivisor(num);

		System.out.println("============");

		// 완전수 : 자기자신을 제외한 약수들의 합이 == 자기자신
		// 6의 약수
		// : 1 2 3 == 6 (완전수 O)
		// 10의 약수
		// : 1 2 5 == 10 (완전수 X)

		int num3 = 8196;
		boolean result3 = isPerfectNumber(num3);
		System.out.println("완전수 : " + result3);

		System.out.println("============");

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int start, int end) {
		String result = "";
		result += start + "~" + end + "까지의 완전수 : ";
		for (int i = start; i <= end; i++) {
			if (isPerfectNumber(i)) {
				result += i + " ";
			}
		}
		System.out.println(result);

	}

	public static boolean isPerfectNumber(int num) {
		int temp = getSumOfDivisors(num) - num;
		if (temp == num) {
			return true;
		}
		return false;

	}

	public static int getSumOfDivisors(int num) {
		// 약수구할때 자기 수를 빼고 for문을 num/2까지 돌리면
		// num/2 ~ num까지 연산과정을 줄일 수 있음
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum + num;
	}

	public static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		}
		return false;
	}

	public static void getDivisor(int num) {
		System.out.print(num + "의 약수 : ");
		String result = "";
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				result += i + " ";
			}
		}
		System.out.println(result);
	}

}

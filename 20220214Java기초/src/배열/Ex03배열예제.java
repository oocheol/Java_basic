package 배열;

public class Ex03배열예제 {

	public static void main(String[] args) {

		// 22, 17, 5, 8, 99, 19, 1
		int[] arr = { 22, 17, 5, 8, 99, 19, 1 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값은 " + max + "입니다.");

		// 3. 최솟값 (내일까지 최솟값 구하는 문제 풀어오기)!!!!
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("가장 작은 값은 " + min + "입니다.");
	}

}

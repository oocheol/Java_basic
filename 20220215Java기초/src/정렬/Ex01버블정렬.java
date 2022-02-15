package 정렬;

import java.util.Arrays;

public class Ex01버블정렬 {

	public static void main(String[] args) {

		// 정수형 배열을 생성
		int[] arr = { 45, 7, 12, 82, 25, 13, 5, 38 };

		// 버블정렬
		// -> 인접한 원소들끼리 비교해서 정렬!

		// 오름차순 정렬
		// 7, 12, 25, 45, 82

		// 1Step
		// 1) 0번 인덱스의 값이 1번 인덱스의 값보다 큰지 비교
		if (arr[0] > arr[1]) {
			// 2) 만약에 더 크다면 0번 인덱스의 값과 1번 인덱스의 값을 서로 교환 (참이었을 때)
			int temp = arr[1]; // 7
			arr[1] = arr[0]; // 45, 45, 12, 82, 25
			arr[0] = temp;
			// ---> 치환의 개념

		}

		// 3) 배열 안에 있는 데이터를 전부 출력!
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		// Arrays.toString(배열의 이름)
		System.out.println(Arrays.toString(arr));

		// 4) 1번방의 데이터와 2번방의 데이터 값을 비교해서 치환

		// 5) 2번방의 데이터와 3번방의 데이터 값을 비교해서 치환

		// 6) 3번방의 데이터와 4번방의 데이터 값을 비교해서 치환
		for (int j = arr.length-1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;

				}
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println("정렬 후 : " + Arrays.toString(arr));

	}

}

package 정렬;

import java.util.Arrays;

public class Ex02선택정렬 {

	public static void main(String[] args) {

		int[] arr = { 70, 7, 98, 13, 24 };

		// 선택정렬
		// --> 가장 큰수 or 가장 작은수를 찾아서 원하는 위치에 해당하는 값을 옮기기!
		// 내림차순 정렬
		// 98, 70, 24, 13, 7
		
		for (int j = 0; j < arr.length - 1; j++) {
			// 안쪽 for문의 역할
			// --> 가장 큰 수가 들어있는 인덱스 번호를 찾아주는 역할
			int maxIndex = j;	

			for (int i = j; i < arr.length; i++) {
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}
			}
			//////////////////////////////////////////////////////////
			// 가장 큰 수가 들어있는 인덱스 번호와 기준 인덱스 안에 들어있는 값을 치환
			int temp = arr[j];
			arr[j] = arr[maxIndex];
			arr[maxIndex] = temp;

			System.out.println(Arrays.toString(arr));

		}

	}

}

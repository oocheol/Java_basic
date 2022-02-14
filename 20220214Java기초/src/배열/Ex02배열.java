package 배열;

import java.util.Scanner;

public class Ex02배열 {

	public static void main(String[] args) {

		// 배열에 스캐너로 입력받은 값을 저장하기!
		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);

		// 2. 배열을 선언
		int[] arr = new int[5];

//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		arr[2] = sc.nextInt();
//		arr[3] = sc.nextInt();
//		arr[4] = sc.nextInt();

		// 입력부
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 출력부
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}

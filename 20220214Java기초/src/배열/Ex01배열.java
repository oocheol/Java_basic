package 배열;

public class Ex01배열 {

	public static void main(String[] args) {

		// 자료구조 : 대량의 데이터를 효율적으로 관리하기 위한 메커니즘
		// Queue, Array, Stack, List, Tree

		// 배열 : 같은 타입의 데이터를 손쉽게 관리하기 위해 쓸 수 있는 기능(자료 구조)

		// 1. 배열의 선언
		// 자료형[] 배열명 = new 자료형[배열의 크기];
		// [] -> 배열을 사용하겠다. 배열을 표현

		// 레퍼런스 변수
		String[] cgi;
		cgi = new String[3];

//		String[] cgi = new String[3];

		// 2. 배열의 데이터 저장
		cgi[0] = "손지영";
		cgi[1] = "김운비";
		cgi[2] = "조자영";
		// 마지막에 있는 인덱스 값 = 배열의 크기 -1
//		cgi[3] = "김동원";

		// 레퍼런스 변수(cgi) : 배열이 어디에 저장되어 있는지 주소값, 참조값
		// [Ljava.lang.String;@1c4af82c
		System.out.println(cgi);

		// 3. 배열의 데이터 확인
		System.out.println(cgi[0]);
		System.out.println(cgi[1]);
		System.out.println(cgi[2]);

		// 반복문 for문 활용
		// 배열에 데이터들 접근하기

		for (int i = 0; i < cgi.length; i++) {
			System.out.println(cgi[i]);
		}

		// 배열 방의 크기에 한번에 접근하는 방법
		// length
		// 마지막에 있는 인덱스 값 = 배열의 크기 -1
		// 마지막에 있는 인덱스 값 = cgi.length -1

		// 배열을 만드는 다른 방법
//		int[] array = {0,1,2,3,4};

		// 정수형의 배열 array 생성하기!
		// 다음과 같은 값으로 초기화 하기
		// 3, 10, 4, 8, 17, 22, 31
		// 반복문을 사용해서 데이터들에 접근
		// 짝수에 해당하는 값들만 출력하기
		int[] array = { 3, 10, 4, 8, 17, 22, 31 };
		for (int i = 0; i < array.length; i++) {
			// array[i] <= 짝수인지 아닌지 판별
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}

		// 응용!!!!
		// 홀수에 해당하는 값들과 총 몇개가 있는지 출력하기!
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			// array[i] <= 홀수인지 아닌지 판별
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);
				count++;
			}
		}
		System.out.println("홀수 갯수 : " + count);

	}
}

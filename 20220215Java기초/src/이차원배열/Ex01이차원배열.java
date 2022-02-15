package 이차원배열;

public class Ex01이차원배열 {

	public static void main(String[] args) {

		// 2차원 배열이란
		// : 1차원 배열안에 1차원 배열이 있는 것

		// 1. 2차원 배열의 선언 및 생성방법(작성규칙)
		// 데이터타입[][] 변수명 = new 데이터타입[행][열];

		int[][] intArray = new int[3][2];
		// 3행 2열의 2차원 배열이 생성

		System.out.println(intArray); // 이차원배열이 저장되어 있는 주소값
		System.out.println(intArray[0]); // 최하위배열이 저장되어 있는 주소값

		// 2차원 배열의 원소에 접근 방법
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[1][0] = 3;
		intArray[1][1] = 4;
		intArray[2][0] = 5;
		intArray[2][1] = 6;

		System.out.println(intArray[1][0]);
		// 2차원 배열의 length 사용
		// -> intArray.length : 2차원 배열의 행의 갯수
		System.out.println(intArray.length);

		// -> intArray[0].length : 해당하는 인덱스(배열) 안에 들어가있는 배열의 크기
		// 2차원 배열의 열의 갯수
		System.out.println(intArray[0].length);

		// 2차원 배열에 반복문 사용해서 접근하기

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.println(intArray[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}

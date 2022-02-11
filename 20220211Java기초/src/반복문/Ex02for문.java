package 반복문;

public class Ex02for문 {

	public static void main(String[] args) {

		// 1. 1 ~ 5까지 반복문 사용해서 출력
//		for (int i=1; i<=5; i++) {
//			System.out.println(i);
//		}
		
		// 2. 10 ~ 1까지 반복문 사용해서 출력
//		for (int i=10; i>=1; i--) {
//			System.out.println(i);
//		}

		// 지역변수 : 특정 구역에서 정의된 변수
		// 전역변수 : main메소드 전체에서 사용할 수 있는 변수
		
		// 3. 21 ~ 57 사이에 짝수만 출력
		for (int i=22; i<=56; i+=2) {
			// console창에서 보고싶은 결과물 == i 같이 변화하는 변수를 찾자
			System.out.println(i);
		}
		
		for (int i=21; i<=57; i++) {
			// i가 짝수인지 아닌지를 판단을해서
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		// 조건식에서 바로 false를 만나서 반복문 탈출
		// 작동을 안함..
		for (int i=21; (i<=57) && (i%2==0);i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

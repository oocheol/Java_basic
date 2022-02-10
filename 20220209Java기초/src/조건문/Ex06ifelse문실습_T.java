package 조건문;

import java.util.Scanner;

public class Ex06ifelse문실습_T {

	public static void main(String[] args) {
		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		
		// 2. 에버랜드에 오신 걸 환영합니다! 출력
		System.out.println("====에버랜드에 오신 걸 환영합니다!=======");

		// 3. 나이를 말씀해주세요. 출력
		System.out.println("나이를 말씀해주세요");

		// 4. 나이를 입력받기
		int age = sc.nextInt();

		// 5. 인원수를 말씀해주세요. 출력
		System.out.println("인원수를 말씀해주세요");
		
		// 6. 인원수 입력받기
		int people = sc.nextInt();
		
		// 7. 총 요금을 계산
		// (조건 - 미성년자인 경우에는 50% 할인, 그렇지 않은경우 5000원 받겠다.)
		
		// ★★★★★지역변수★★★★★
		// {} --> 영역의 범위(scope)를 의미한다!!
		// {} 안에서 처음으로 선언된 변수는 {} 안에서만 사용가능하다!
		
		int cost = 5000;
		if (age<20) {
			// 미성년자 --> 기본요금에서 50% 할인
			cost = (int) (cost * 0.5 * people);
		} else {
			// 성인 --> 기본요금
			cost *= people; //복합대입연산자 --> cost = cost * people
		}
		// 8. 계산된 요금 출력
		System.out.println("총 "+ cost +"원 입니다.");
		
		
	

		
		
		
		
		
	}

}

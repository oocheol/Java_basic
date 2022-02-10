package 이항연산자;

import java.util.Scanner;

public class Ex01산술연산자 {

	public static void main(String[] args) {
		
		// 입력도구 불러오기
		Scanner sc = new Scanner(System.in);
		// import 단축키 -> ctrl + shift + o
		// 입력하는 명령어 작성하기!
		System.out.print("숫자를 입력하세요 >> "); 
		// 개행 없애기 println -> print ('ln' 삭제)
		int num1 = sc.nextInt();
		// num1에 정수데이터가 잘들어갔는지 확인을 해보자.
		System.out.println(num1);
		
		// num2 변수에 숫자를 입력받을 수 있도록 만들어봅시다.
		// 변수명 중복x
		// 출력문으로 "숫자를 입력하세요>> "
		System.out.print("숫자를 입력하세요>> ");
		int num2 = sc.nextInt();
		
		// 문자열 더하기 -> 문자형으로 자동형변환
		// 문자 + 숫자 = 문자
		// 
		System.out.println("더하기 결과 >> " + (num1+num2));
		
		
		// 빼기, 곱하기, 몫, 나머지 결과 구하기
		System.out.println("빼기 결과 >> " + (num1 - num2));
		System.out.println("곱하기 결과 >> " + (num1 * num2));
		System.out.println("몫 결과 >> " + (num1 / num2));
		System.out.println("나머지 결과 >> " + (num1 % num2));
		
		// 몫 연산자를 사용해서 (나누기연산자) 소수점까지 나오게해봅시당!
		// num1 / num2 연산을 수행했을 때, 결과값 정수형
		// num1 / num2 연산을 실수형 돌려받고 싶으면
		// 정수형 -> 실수형 바꿔주자 : 즉, 형변환
		
		double result = (double) num1 / num2;
		// num1 = 5, num2 = 3, num1/num2 = 1 -> 1.0
		// (double) num1 / num2 = 1.6666
		System.out.println("나누기 결과 >> " + result);
		 
	}

}

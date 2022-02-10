package 조건문응용실습;

import java.util.Scanner;

public class Ex01자판기 {

	public static void main(String[] args) {

		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 출력문 작성하기
		System.out.println("금액을 입력하세요.");
		
		// 3. charge 입력금액 저장할 변수 선언하기
		int charge = sc.nextInt();
		
		// 4. 출력문 작성
		System.out.println("메뉴를 고르세요.");
		
		// 5. 출력문 작성하기 (메뉴판)
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		
		// 6. 사용자가 선택한 메뉴 입력받기 (변수 선언하기)
		int menu = sc.nextInt();
		
		// 7. 사용자가 선택한 메뉴가 무엇인지 판단
		// 판단 -----> 조건문
		// switch 문이나 if - else if
		int price = 0;
		switch (menu) {
		case 1:
			price = 700;
			break;
		case 2 :
			price = 1000;
			break;
		case 3 :
			price = 500;
			break;
			
		}
		System.out.println("잔돈 : "+ (charge - price) + "원");
		
		
	}

}

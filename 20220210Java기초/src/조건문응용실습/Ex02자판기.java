package 조건문응용실습;

import java.util.Scanner;

public class Ex02자판기 {

	public static void main(String[] args) {

		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		// 2. 출력문 (금액을 입력하세요.)
		System.out.println("금액을 입력하세요.");
		// 3. 금액 입력받아서 저장하기
		int charge = sc.nextInt();
		// 4. 출력문 (메뉴를 고르세요.)
		System.out.println("메뉴를 고르세요.");
		// 5. 출력문 (메뉴판)
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");

		// 6. 선택한 메뉴 입력받아서 저장하기
		int menu = sc.nextInt();

		// 7. 사용자가 어떠한 메뉴를 선택했는지 판단 ---> 조건문
		// 메뉴의 금액보다 지불한 금액이 작다면 돈이 부족해요
		// 이전 문제와 같이 금액이 충분하다면 잔돈을 돌려줄 수 있도록 하자.
		// ex) charge = 500원
		// 만약에 select == 2
		// 사용자가 금액이 메뉴의 금액보다 적은지 ? 많은지 ? 판단
		// 메뉴 금액보다 크다면 잔돈을 돌려주면 됩니다.
		// 메뉴 금액보다 작다면 돈이 부족해요 ㅠㅠ 출력 후에 내가 입력한 금액 전부를 돌려준다!!
		
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
		int result = charge - price;
		
		if (result < 0) {
			result = charge;
			System.out.println("돈이 부족해요ㅠㅠ");
			
		}
		System.out.println("잔돈 : "+ (result) + "원");
		
		int ex_1000 = result / 1000;
		result %= 1000;
		int ex_500 = result / 500;
		result %= 500;
		int ex_100 = result / 100;
		
		System.out.print("천원 : " + ex_1000 +"개, ");
		System.out.print("오백원 : " + ex_500 +"개, ");
		System.out.println("백원 : " + ex_100 +"개");
		
		
		
		
		
		
		
	}

}

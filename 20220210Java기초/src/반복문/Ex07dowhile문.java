package 반복문;

import java.util.Scanner;

public class Ex07dowhile문 {

	public static void main(String[] args) {

		// do-while문 문법
		// do{실행할 로직}while(검사조건);
//		do {
//			System.out.println("인공지능반 화이팅~");
//		} while (false);

		// 다이어트 관리 프로그램을 만들어보자~
		Scanner sc = new Scanner(System.in);
		
		// 1. 현재 몸무게 입력
		System.out.print("현재몸무게 : ");
		int current = sc.nextInt();
		// 2. 목표 몸무게 입력
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();

		// 3. 주차 감량몸무게 입력
		int week = 1;
		do {
			System.out.print(week+"주차 감량 몸무게 : ");
			week++;
		// 4-1. 현재몸무게 = 현재몸무게 - 감량몸무게
			int down = sc.nextInt();
			current -= down;
		// 4-2. 현재몸무게가 목표몸무게에 도달했는지 조건을 판단
		}	while(goal <= current); 
		// 5. 목표몸무게에 도달했다면 프로그램 종료!
		System.out.println(current+"kg 달성!! 축하합니다!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

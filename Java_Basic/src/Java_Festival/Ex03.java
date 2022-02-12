package Java_Festival;

import java.util.Scanner;

public class Ex03 {

		public static void main(String args[]) {
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

package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex06Plus게임 {

	public static void main(String[] args) {

		// 랜덤한 수를 뽑아내는 방법
		// 1. 랜덤한 수를 추출해주는 도구꺼내오기!
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===Plus Game===");
		
		while (true) {
			// 2. 랜덤한 수 생성하기
			// 1~9까지 범위지정
			// 1. 랜덤으로 정수 2개를 뽑아오기
			// 1~9까지의 랜덤한 수로 추출해주기
			int ranNum = ran.nextInt(9) + 1; // 1~9
			int ranNum_2 = ran.nextInt(9) + 1; // 1~9

			// 2. 문제를 출력
			System.out.print(ranNum + "+" + ranNum_2 + "=");

			// 3. 사용자로부터 정답 입력
			int input_num = sc.nextInt();

			// 4. 입력받은 값과 실제 정답이 일치하는지 여부 판단
			int answer = ranNum + ranNum_2;

			if (answer == input_num) {
				// 5. 일치하면 성공! 출력
				System.out.println("Success");
			} else {
				// 6. 일치하지 않으면 실패! 출력
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까? >> ");
				String input_str = sc.next();
				if (input_str.equals("Y")) {
					// 문자열이 같은지 비교하기 위해서는
					// .equals(비교하고 싶은 문자열) 사용!
					// !str.equals (같지않은지 여부 확인)
					continue; // 반복문을 끝내지 말고 계속해서 진행하라는 키워드!
					// while문의 시작점으로 돌아가게 된다!
				} else {
					System.out.println("종료합니다.");
					break;
				}
				
			}
		}
		
		

	}

}

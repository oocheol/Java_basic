package 반복문;

import java.util.Scanner;

public class Ex05while문예제 {

	public static void main(String[] args) {
		
		// 입력받은 수가 홀수라면 홀수+1
		// 입력받은 수가 짝수라면 짝수+1
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int even = 0; // 짝수
		int odd = 0; // 홀수
				
		while(true) {
			System.out.print("숫자입력: ");
			num = sc.nextInt();
			if (num == -1) {
				break;
			}
			switch (num % 2) {
			case 0 :
				even ++;
				break;
			case 1 :
				odd ++;
				break;
			}
			
			System.out.println("짝수개수: " + even);
			System.out.println("홀수개수: " + odd);
			
		}
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package 게임;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pokemon pairi = new Pokemon("불", "파이리", 1000, "화염방사", 100);
		Pokemon kkobuk = new Pokemon("물", "꼬부기", 1500, "물대포", 200);
		
		// 파이리의 스킬을 출력해주세요.
		// System.out.println(pairi.getSkill());
		
		System.out.println("======포켓몬을 선택하세요======");
		System.out.println("[1]파이리 [2]꼬부기");
		// 사용자로부터 입력받기
		int input = sc.nextInt();
		if(input == 1) {
			
			System.out.println("[1]일반공격 [2]스킬");
			// 사용자로부터 입력받기
			int input2 = sc.nextInt();
			
		} else if(input == 2){
			
			System.out.println("[1]일반공격 [2]스킬");
			// 사용자로부터 입력받기
			int input2 = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

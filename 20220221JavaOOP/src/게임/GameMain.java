package 게임;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pokemon pairi = new Pokemon("불", "파이리", 1000, "화염방사", 100);
		Pokemon kkobuk = new Pokemon("물", "꼬부기", 1500, "물대포", 200);

		// 파이리의 스킬을 출력해주세요.
		// System.out.println(pairi.getSkill());

		int count = 1;
		while (true) {
			if (pairi.getHp() <= 0) {
				System.out.println("★★★★꼬부기 승리 !!★★★★");
				System.out.println("게임이 종료되었습니다.");
				break;
			} else if (kkobuk.getHp() <= 0) {
				System.out.println("★★★★파이리 승리 !!★★★★");
				System.out.println("게임이 종료되었습니다.");
				break;
			}

			System.out.println("******"+count + "번째 게임 ******");
			System.out.println("======포켓몬을 선택하세요======");
			System.out.println("[1]파이리 [2]꼬부기");
			// 사용자로부터 입력받기
			int input = sc.nextInt();
			if (input == 1) {
				// 파이리 선택
				// 파이리가 꼬부기 공격
				System.out.println("[1]일반공격 [2]스킬");
				// 사용자로부터 입력받기
				int input2 = sc.nextInt();

				if (input2 == 1) {
					// 1. 일반공격을 선택했다면 꼬부기의 체력을 파이리의 공격력만큼 감소
					kkobuk.setHp(kkobuk.getHp() - pairi.getAttack());
					System.out.println("현재 꼬부기의 체력 : " + kkobuk.getHp() +
							"(-" + (int)pairi.getAttack() + ")");

				} else if (input2 == 2) {
					// 2. 스킬공격을 선택했다면 꼬부기의 체력을 파이리의 공격력*1.5배만큼 감소
					kkobuk.setHp(kkobuk.getHp() - (int) (pairi.getAttack() * 1.5));
					System.out.println("현재 꼬부기의 체력 : " + kkobuk.getHp() +
							"(-" + (int)(pairi.getAttack()*1.5) + ")");
				}

			} else if (input == 2) {
				// 꼬부기 선택
				// 꼬부기가 파이리 공격
				System.out.println("[1]일반공격 [2]스킬");
				// 사용자로부터 입력받기
				int input2 = sc.nextInt();
				if (input2 == 1) {
					// 1. 일반공격을 선택했다면 파이리의 체력을 꼬부기의 공격력만큼 감소
					pairi.setHp(pairi.getHp() - kkobuk.getAttack());
					System.out.println("현재 파이리의 체력 : " + pairi.getHp() +
							"(-" + (int)kkobuk.getAttack() + ")");

				} else if (input2 == 2) {
					// 2. 스킬공격을 선택했다면 파이리의 체력을 꼬부기의 공격력*1.5배만큼 감소
					pairi.setHp(pairi.getHp() - (int) (kkobuk.getAttack() * 1.5));
					System.out.println("현재 파이리의 체력 : " + pairi.getHp() +
							"(-" + (int)(kkobuk.getAttack()*1.5) + ")");
				}

			}

			count++;
		}
		// 3. 둘 중 한마리의 포켓몬의 hp가 0보다 작거나 같을때까지 게임은 반복!
		// 한번 공격을 하고 나면 다시 포켓몬 선택지로 이동하게끔 설계해야함!
		// 중간중간 출력문은 자유롭게
		// ex) 파이리의 체력 : 1500

	}

}

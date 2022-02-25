package 게임;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 개발자1 --> 2명

		// 화면에 보여지는 게임 logic

		// 개임객체
		PlusGame game = new PlusGame();
//		GameDummy game = new GameDummy();
		// GameDummy는 임시로 만들어내기 위한 객체
		// 개발자2가 다 완성하고나면 Plusgame으로 변경
		int num = 1;
		while (true) {
			if (num > 5) {
				System.out.println();
				System.out.println("  ▬▬▬.◙.▬▬▬ \r\n"
						+ "═▂▄▄▓▄▄▂ \r\n"
						+ "◢◤ █▀▀████▄▄▄▄◢◤ \r\n"
						+ "█▄ █ █▄ ███▀▀▀▀▀▀▀╬ \r\n"
						+ "◥█████◤ \r\n"
						+ "══╩══╩═ \r\n"
						+ "  ╬═╬ \r\n"
						+ "  ╬═╬ ＼○ノ {Game Over)\r\n"
						+ "  ╬═╬  / \r\n"
						+ "  ╬═╬ ノ) \r\n"
						+ "  ╬═╬");
				System.out.println("━━━━━┓\r\n"
						+ "┓┓┓┓┓┃/ . `\r\n"
						+ "┓┓┓┓┓ : .＼○ノ\r\n"
						+ "┓┓┓┓┓┃ `  / 　　\r\n"
						+ "┓┓┓┓┓┃ `ノ) . `\r\n"
						+ "┓┓┓┓┓┃ ,\r\n"
						+ "┓┓┓┓┓┃　　　 　○ \r\n"
						+ "┓┓┓┓┓┃　　　 　人\r\n"
						+ "┓┓┓┓┓┃　　 　　/)\r\n"
						+ "┓┓┓┓┓┃　 ┎━━━━━━┒\r\n"
						+ "┓┓┓┓┓┃ 　┃┏┓┏┓┏┓┃\r\n"
						+ "┓┓┓┓┓┃　 ┃┗┛┗┛┗┛┃\r\n");
				break;
			}
			System.out.println("· · ─────── ·𖥸· ─────── · ·· · ─────── ·𖥸· ─────── · ·");
			System.out.println("█◤◢◤◢◤◢◤◢█ " + num + "번째 숫자더하기 게임 █◤◢◤◢◤◢◤◢█");
			System.out.println("· · ─────── ·𖥸· ─────── · ·· · ─────── ·𖥸· ─────── · ·");
			num++;
			// 1. 랜덤으로 문제를 출제
			// game.makeRandom(); // 랜덤으로 출제가 됨
			game.makeRandom();

			// 랜덤으로 출력된 문제를 보여주자
			// getQuizMsg()를 사용해서 문제를 출력하자!!!
			System.out.print("█◤◢◤◢◤◢◤◢█ 문제 >> ");
			System.out.print(game.getQuizMsg());
			System.out.println("??? << █◤◢◤◢◤◢◤◢█");

			for (int i = 1; i <= 3; i++) {
				// 사용자가 답을 입력
				System.out.print("✐✎✐✎✐✎✐✎✐ 정답은?? >> ");
				int answer = sc.nextInt();

				if (answer >= 0) {
					// 사용자가 입력한 답이 맞다면 정답입니다!!!
					// 틀리다면 오답입니다.!!!!!
					if (game.isCheckAnswer(answer)) {
						System.out.println("˚∧＿∧  　+        —̳͟͞͞💗\r\n"
								+ "(  •‿• )つ  —̳͟͞͞ 💗         —̳͟͞͞💗 +\r\n"
								+ "(つ　 <   정 답 !!!     —̳͟͞͞💗\r\n"
								+ "｜　 _つ      +  —̳͟͞͞💗         —̳͟͞͞💗 ˚\r\n"
								+ "`し´");
						break;
					} else {
						System.out.print("|￣￣￣￣￣￣￣|\r\n"
								+ "|땡!! 틀렸습니다!!\r\n"
								+ "|＿＿＿＿＿＿＿| \r\n"
								+ "(\\__/)|| \r\n"
								+ "(•ㅅ•).|| \r\n"
								+ "/ . . . .づ");
						System.out.println(" (남은 기회 : " + (3 - i) + ")");
						System.out.println();

					}
				} else {
					System.out.println("음수를 입력하셨습니다. 다시 입력해주세요!!");
				}
			}
		}
	}

}

package 연습장;

public class 별찍기_다이아몬드 {

	public static void main(String[] args) {

		String star = "*";
		String blank = " ";

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(blank);
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(star);
			}
			System.out.println();


		}
		for (int s = 4; s >= 1; s--) {
			for (int j = 1; j <= 5-s; j++) {
				System.out.print(blank);
			}
			for (int k = 1; k <= s * 2 - 1; k++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}

}

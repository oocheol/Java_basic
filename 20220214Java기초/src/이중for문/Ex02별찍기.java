package 이중for문;

public class Ex02별찍기 {

	public static void main(String[] args) {

		// * 하나만 가지고 아래와 같은 모양을 만들어주세요.
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

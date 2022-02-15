package 이차원배열;

public class Ex03이차원배열실습3 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int num = 21;
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[i][j] += num;
				num++;

			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

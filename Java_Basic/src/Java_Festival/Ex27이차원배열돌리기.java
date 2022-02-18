package Java_Festival;

public class Ex27이차원배열돌리기 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		System.out.println("원본");
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("90도 회전");

		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		

	}

}

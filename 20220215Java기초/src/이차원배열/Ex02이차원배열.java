package 이차원배열;

public class Ex02이차원배열 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		// 반복문을 사용해서 이차원배열에 데이터를 넣어보자!!
		for (int j = 0; j <= 4; j++) {
			for (int i = 0; i <= 4; i++) {
				arr[j][i] = 1;
			}
		}
		
		// 반복문을 사용해서 데이터가 잘 들어가있는지 확인해봅시다.
		// 출력부를 작성해보자!
		for (int j = 0; j <= 4; j++) {
			for (int i = 0; i <= 4; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			// 한 행이 다 출력될 때마다 개행 시키기!
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}

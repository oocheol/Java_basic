package �������迭;

public class Ex02�������迭 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		// �ݺ����� ����ؼ� �������迭�� �����͸� �־��!!
		for (int j = 0; j <= 4; j++) {
			for (int i = 0; i <= 4; i++) {
				arr[j][i] = 1;
			}
		}
		
		// �ݺ����� ����ؼ� �����Ͱ� �� ���ִ��� Ȯ���غ��ô�.
		// ��ºθ� �ۼ��غ���!
		for (int j = 0; j <= 4; j++) {
			for (int i = 0; i <= 4; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			// �� ���� �� ��µ� ������ ���� ��Ű��!
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}

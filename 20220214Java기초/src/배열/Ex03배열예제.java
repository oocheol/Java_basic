package �迭;

public class Ex03�迭���� {

	public static void main(String[] args) {

		// 22, 17, 5, 8, 99, 19, 1
		int[] arr = { 22, 17, 5, 8, 99, 19, 1 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");

		// 3. �ּڰ� (���ϱ��� �ּڰ� ���ϴ� ���� Ǯ�����)!!!!
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("���� ���� ���� " + min + "�Դϴ�.");
	}

}

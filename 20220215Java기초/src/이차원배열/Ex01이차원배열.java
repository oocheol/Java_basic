package �������迭;

public class Ex01�������迭 {

	public static void main(String[] args) {

		// 2���� �迭�̶�
		// : 1���� �迭�ȿ� 1���� �迭�� �ִ� ��

		// 1. 2���� �迭�� ���� �� �������(�ۼ���Ģ)
		// ������Ÿ��[][] ������ = new ������Ÿ��[��][��];

		int[][] intArray = new int[3][2];
		// 3�� 2���� 2���� �迭�� ����

		System.out.println(intArray); // �������迭�� ����Ǿ� �ִ� �ּҰ�
		System.out.println(intArray[0]); // �������迭�� ����Ǿ� �ִ� �ּҰ�

		// 2���� �迭�� ���ҿ� ���� ���
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[1][0] = 3;
		intArray[1][1] = 4;
		intArray[2][0] = 5;
		intArray[2][1] = 6;

		System.out.println(intArray[1][0]);
		// 2���� �迭�� length ���
		// -> intArray.length : 2���� �迭�� ���� ����
		System.out.println(intArray.length);

		// -> intArray[0].length : �ش��ϴ� �ε���(�迭) �ȿ� ���ִ� �迭�� ũ��
		// 2���� �迭�� ���� ����
		System.out.println(intArray[0].length);

		// 2���� �迭�� �ݺ��� ����ؼ� �����ϱ�

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.println(intArray[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}

package ����;

import java.util.Arrays;

public class Ex02�������� {

	public static void main(String[] args) {

		int[] arr = { 70, 7, 98, 13, 24 };

		// ��������
		// --> ���� ū�� or ���� �������� ã�Ƽ� ���ϴ� ��ġ�� �ش��ϴ� ���� �ű��!
		// �������� ����
		// 98, 70, 24, 13, 7
		
		for (int j = 0; j < arr.length - 1; j++) {
			// ���� for���� ����
			// --> ���� ū ���� ����ִ� �ε��� ��ȣ�� ã���ִ� ����
			int maxIndex = j;	

			for (int i = j; i < arr.length; i++) {
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}
			}
			//////////////////////////////////////////////////////////
			// ���� ū ���� ����ִ� �ε��� ��ȣ�� ���� �ε��� �ȿ� ����ִ� ���� ġȯ
			int temp = arr[j];
			arr[j] = arr[maxIndex];
			arr[maxIndex] = temp;

			System.out.println(Arrays.toString(arr));

		}

	}

}

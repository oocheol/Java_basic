package �ݺ���;

public class Ex02for�� {

	public static void main(String[] args) {

		// 1. 1 ~ 5���� �ݺ��� ����ؼ� ���
//		for (int i=1; i<=5; i++) {
//			System.out.println(i);
//		}
		
		// 2. 10 ~ 1���� �ݺ��� ����ؼ� ���
//		for (int i=10; i>=1; i--) {
//			System.out.println(i);
//		}

		// �������� : Ư�� �������� ���ǵ� ����
		// �������� : main�޼ҵ� ��ü���� ����� �� �ִ� ����
		
		// 3. 21 ~ 57 ���̿� ¦���� ���
		for (int i=22; i<=56; i+=2) {
			// consoleâ���� ������� ����� == i ���� ��ȭ�ϴ� ������ ã��
			System.out.println(i);
		}
		
		for (int i=21; i<=57; i++) {
			// i�� ¦������ �ƴ����� �Ǵ����ؼ�
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		// ���ǽĿ��� �ٷ� false�� ������ �ݺ��� Ż��
		// �۵��� ����..
		for (int i=21; (i<=57) && (i%2==0);i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

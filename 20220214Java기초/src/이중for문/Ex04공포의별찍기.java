package ����for��;

public class Ex04�����Ǻ���� {

	public static void main(String[] args) {
		
		//     *
		//    **
		//   ***
		//  ****
		// *****
		String star = "*";
		String blank = " ";
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5-i;j++) {
				System.out.print(blank);
			}
			for (int k=1;k<=i;k++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		
		// for�� ---> �ݺ�Ƚ���� ��Ȯ�ϰ� �� �� ���� ���
		// while��, do-while�� ---> �ݺ�Ƚ���� ��Ȯ�ϰ� �� �� ���� ���
		
		// while(true){
		// }
		// --> ���ѹݺ���
		
//		for(;;) {
//			
//		}
//		---> ���ѹݺ��� (���� ���ϴ� �����鸸 ä���� for���� ���� �� �ִ�!)
		
		
		
		
		
		
		
		
		
	}

}

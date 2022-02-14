package 이중for문;

public class Ex04공포의별찍기 {

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
		
		
		// for문 ---> 반복횟수를 명확하게 알 때 많이 사용
		// while문, do-while문 ---> 반복횟수를 명확하게 모를 때 많이 사용
		
		// while(true){
		// }
		// --> 무한반복문
		
//		for(;;) {
//			
//		}
//		---> 무한반복문 (내가 원하는 구문들만 채워서 for문을 만들 수 있다!)
		
		
		
		
		
		
		
		
		
	}

}

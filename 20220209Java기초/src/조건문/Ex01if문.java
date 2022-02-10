package 조건문;

public class Ex01if문 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		
		// 3 > 4 ---> false
		if (a>b) {
			// 소괄호 안에 조건식이 true라면 실행문장 실행
			System.out.println("a가 b보다 크다");
		}
		// 조건식이 false라면 실행문장을 실행시키지 않고 빠져나온다!!
		System.out.println("조건문 빠져나옴!!");
		
		
	}

}

package 메서드;

public class Ex01메서드 {

	public static void main(String[] args) {

		// 입사(취업)
		System.out.println(3+5);
		System.out.println(12+17);
		System.out.println(33+55);
		System.out.println(123+222);

		// 메서드를 사용해서 더하는 기능
		addNumber(3,5);
		addNumber(12,17);
		addNumber(33,55);
		addNumber(123,222);
		
		// 2를 더해주기 위해서 어떤 부분을 바꾸면 addNumber에 2가 더해질까요?
		// 메서드로직에 +2
		
	}

	// 메서드 메인 밖에서 작성이 되어진다.
	public static void addNumber(int a, int b) {
		// addNumber = 메서드의 이름
		// int a, int b 메서드에서 사용할 변수 -> 매개변수(parameter)
		// 중괄호 안에서 메서드 로직을 작성해보자.
		System.out.println(a+b+2);
	}
	
	
	
}

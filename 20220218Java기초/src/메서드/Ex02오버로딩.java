package 메서드;

public class Ex02오버로딩 {

	public static void main(String[] args) {

		// 메소드 오버로딩 
		// overloading
		// 같은 이름의 메서드를 중복하여 정의하는 것을 의미
		// 같은 이름을 가지지만, 매개변수의 갯수나 타입을 다르게 하면
		// 하나의 이름으로 메서드를 작성할 수 있다.
		
		display(10);
		display(10,2);
		
	}
	
	public static void display(int num1) {
		System.out.println(num1);
	}
	
	public static void display(int num1, int num2) {
		System.out.println(num1+num2);
	}
	

}

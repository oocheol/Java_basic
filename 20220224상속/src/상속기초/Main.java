package 상속기초;

public class Main {

	public static void main(String[] args) {
		// 실행공간
		
		// 1. Parent 설계도를 기반으로 p 객체 생성
		Parent p = new Parent();
		
		// 2. Child 설계도를 기반으로 c 객체 생성
		Child c = new Child();
		
		// p의 토마토 파스타를 만든다.
		p.makePasta();
		
		// c의 토마토 파스타를 만든다.
		c.makePasta();
		
		// 자식이 메소드 오버라이딩을 했다면 오버라이딩 된 기능을 사용하게 된다.
		c.makeCream();
		
		
		
		////////////////////////////////
		// 레퍼런스 변수의 형변환
		// ---> 상속이 전제되어있어야 한다.
		// 1. Upcasting
		// -> 자식 클래스가(서브, 하위) 부모클래스(슈퍼, 상위)로 자동형변환
		// Parent
		Parent parent = new Child();
		// 특징!
		// 자식클래스가 부모클래스의 메소드를 오버라이딩한 경우에는!
		// 자식클래스가 오버라이딩한 메소드를 사용한다.
		parent.makeCream();
		
		// 2. downcasting
		// : 부모클래스가 자식클래스로 강제형변환
		// --> 업캐스팅된 객체에 한해서만 사용가능하다.★★★★★★★★★
		// --> 업캐스팅된 객체가 다시 자신의 데이터타입으로 되돌아오는 것
		Child child = (Child) parent;
		child.makeBbang();
		
		
//		Child child = (Child) new Parent();
		
		// --> ClassCastException 발생!
		// Exception이란?
		// 문법상의 오류(Syntax Error)는 없으나,
		// 실행했을 때 예외상황이 발생하는 것!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

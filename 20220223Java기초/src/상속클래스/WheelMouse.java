package 상속클래스;

public class WheelMouse extends Mouse{

	// Mouse의 기능을 상속
	// 상속의 키워드 -> extends
	// ('확장하다'라는 의미를 가진다.)
	// : 자식 클래스 extends 부모 클래스
	
	
	// + 스크롤하는 기능을 추가
	public void scroll() {
		System.out.println("스크롤 하는중~");
	}
	
	
	
}

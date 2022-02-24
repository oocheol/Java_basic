package 상속기초;

public class Child extends Parent{
	// 자식클래스
	
	// 크림리조또를 만든다 ---> 버섯을 추가?
	// 메소드 오버라이딩
	// --> 오버라이딩은 상속이 전제되어있어야 한다!
	// (부모클래스의 메소드를 재정의하는 개념)
	// : 메소드의 구조(접근제한자, 리턴타입, 메소드명, 매개변수)는 동일한데
	//	 메소드 {}(body)안에 있는 로직만 '재정의'하는 기법
	// cf) 오버로딩 중복정의 / 오버라이딩 재정의

	/**
	 * @author 김모세
	 * @param 매개변수 없음
	 * @return 리턴타입 없음
	 * @since 2022.02.24
	 * 
	 * */
	
	@Override // --> annotation(주석) ---> 메타데이터
	public void makeCream() {
		System.out.println("버섯을 추가한 맛있는 크림리조또!");
	}
	// 오버라이딩 단축키
	// alt + shift + s
	
	
	
	
	// 새로운 기능! 추가기능 설계
	public void makeBbang() {
		System.out.println("식전빵을 제공한다~!~~~~");
	}


	@Override
	public void makePasta() {
		super.makePasta(); // ---> 생성자 자동완성 !
		// super --> 부모클래스를 의미한다!
		// 밑에도 추가적인 코드 작성 가능!
	}
	
	
	

}

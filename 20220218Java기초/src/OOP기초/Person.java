package OOP기초;

public class Person {
	// 클래스 == 설계도면
	// 객체를 생성하기 전 우리가 직접 설계하는 도면
	// 1. 필드(Field)
	// : 데이터, 속성
	String name;
	char gender;
	int age;
	
	// Person이라는 자료형을 만들었다.
	
	// 2. 메서드(Method)
	// : 로직, 기능, 행위
	// 숨쉬기 기능
	public void breath() {
		System.out.println("후하후하 숨쉬는 중");
	}
	
	// 밥먹기
	public String talk() {
		return "말말맘라마라말맒람람라%#^@" ;
	}
	
	
	
	
	
}

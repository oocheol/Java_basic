package OOP기초;

public class Main {

	public static void main(String[] args) {
		// 실행되는 공간
		// 1. 설계도면을 가지고 객체를 생성
		// 설계도면 이름
		Person jayeon = new Person();
		// new -> 레퍼런스 변수 생성 키워드
		
		jayeon.breath();
		jayeon.name = "조자연";
		
		System.out.println(jayeon.name);
		
		jayeon.age = 3;
		jayeon.gender = 'F';
		
		System.out.println(jayeon.age);
		System.out.println(jayeon.gender);
		
		// 동일한 설계도면을 가지고 여러개의 객체생성가능하다.
		// Person jiyoung
		
		Person jiyoung = new Person();
		jiyoung.name = "손지영";
		jiyoung.gender = 'F';
		jiyoung.age = 23;
		
		System.out.println(jiyoung.name);
		System.out.println(jiyoung.gender);
		System.out.println(jiyoung.age);
		
		
	}

}

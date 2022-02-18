package 학생관리;

public class Student {

	// 학생들의 정보를 관리할 수 있는 설계도
	// 설계도는 설계만 진행할 수 있으므로
	// 객체를 생성하는 main()는 필요가 없다.
	
	// 1. 필드(Field)
	// 이름, 학번(String), 나이, Java점수, Web점수, Android점수
	String name;
	String studentNumber;
	int age;
	int javaScore;
	int webScore;
	int androidScore;
	
	// 생성자 메소드 생성하기
	// 객체를 생성할 때 Field에 있는 데이터를 초기화 시킬 수 있는 메소드
	// 생성자(constructor)
	// 1) 생성자도 메서드이다.
	// 2) 메서드의 이름이 클래스의 이름과 동일한 이름을 갖는다.
	// 3) 리턴타입을 지정하지 않는다.
	// 4) 매개변수로 아무것도 받지 않는 생성자를 기본생성자라고 부른다.
	// ----> 기본 생성자는 생략이 가능하다.
	// ----> 단, 새로운 생성자를 만든다면 기본생성자는 덮어씌워진다.
	// 생성자를 오버로딩 ---> 중복정의
	// 매개변수의 개수와 타입을 다르게 해서 중복으로 정의하는 것
	// 메소드 오버로딩
	
	public Student(String name, String studentNumber, int age, 
			int javaScore, int webScore, int androidScore) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.age = age;
		this.javaScore = javaScore;
		this.webScore = webScore;
		this.androidScore = androidScore;
		
		// this => 현재 내 클래스를 지칭!
		// this => 클래스 나 자신을 기리키는 키워드!!!
		
	}
	
	
	
	
	
	
	
	// 2. 메서드(Method)
	// show() 메소드 생성 -> 일반메서드
	// 접근제한자 리턴타입 메소드 이름 매개변수
	public void show() {
		System.out.println(name + "님 안녕하세요.");
	}
	
	
	
}

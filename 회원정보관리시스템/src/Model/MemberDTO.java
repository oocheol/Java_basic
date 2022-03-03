package Model;

public class MemberDTO {
	// Model
	// 프로그램에서 View와 Controller간 값을 주고 받을 때 사용하는 데이터 유형
	// DTO
	// Data Transfer Object
	// getter, setter 전부 가지고 있는 객체
	
	// VO
	// Value Object
	// Read Only(읽기전용) --> setter 메소드가 없는 객체
	
	// 1. 필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	// 2. 메소드
	// - 모든 필드의 값을 채울 수 있는 생성자
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	// - getter메소드
	// - setter메소드

	// 생성자를 오버로딩함!~!!!!
	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public MemberDTO(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	

	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// 출력문 안에 해당하는 클래스 레퍼런스 변수가 들어가게 되면 자동으로 실행되는 메소드
		if (id.length() == 7) {
			return id + "  " + name + " \t " + age;
		} else if (id.length() > 7) {
			return id + " " + name + " \t " + age;
		}
		return id + " \t " + name + " \t " + age;
	}
	
	
	
	
	
	
	
	
	
	
	
}

package Model;

public class MemberDTO {
	// Model
	// ���α׷����� View�� Controller�� ���� �ְ� ���� �� ����ϴ� ������ ����
	// DTO
	// Data Transfer Object
	// getter, setter ���� ������ �ִ� ��ü
	
	// VO
	// Value Object
	// Read Only(�б�����) --> setter �޼ҵ尡 ���� ��ü
	
	// 1. �ʵ�
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	// 2. �޼ҵ�
	// - ��� �ʵ��� ���� ä�� �� �ִ� ������
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	// - getter�޼ҵ�
	// - setter�޼ҵ�

	// �����ڸ� �����ε���!~!!!!
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
		// ��¹� �ȿ� �ش��ϴ� Ŭ���� ���۷��� ������ ���� �Ǹ� �ڵ����� ����Ǵ� �޼ҵ�
		if (id.length() == 7) {
			return id + "  " + name + " \t " + age;
		} else if (id.length() > 7) {
			return id + " " + name + " \t " + age;
		}
		return id + " \t " + name + " \t " + age;
	}
	
	
	
	
	
	
	
	
	
	
	
}

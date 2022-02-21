package 게임;

public class Pokemon {

	// 1. 필드(데이터, 속성)
	private String type; // 타입

	private String name; // 이름

	private int hp; // 체력

	private String skill; // 스킬

	private int attack; // 공격력

	// 2. 메소드(기능, 행위, 로직)

	// 모든 필드의 값을 채워주는 생성자 만들기

	public Pokemon(String type, String name, int hp, String skill, int attack) {
		this.type = type;
		this.name = name;
		this.hp = hp;
		this.skill = skill;
		this.attack = attack;
	}

	// getter 메소드 --> 객체의 필드값을 가져갈 때 사용하는 메소드
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public String getSkill() {
		return skill;
	}

	public int getAttack() {
		return attack;
	}

	// setter 메소드 --> 필드에 있는 값을 수정할 때 사용하는 메소드
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
	
	
	
	
	
	
	
	
}

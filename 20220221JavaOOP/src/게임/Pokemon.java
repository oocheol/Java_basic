package ����;

public class Pokemon {

	// 1. �ʵ�(������, �Ӽ�)
	private String type; // Ÿ��

	private String name; // �̸�

	private int hp; // ü��

	private String skill; // ��ų

	private int attack; // ���ݷ�

	// 2. �޼ҵ�(���, ����, ����)

	// ��� �ʵ��� ���� ä���ִ� ������ �����

	public Pokemon(String type, String name, int hp, String skill, int attack) {
		this.type = type;
		this.name = name;
		this.hp = hp;
		this.skill = skill;
		this.attack = attack;
	}

	// getter �޼ҵ� --> ��ü�� �ʵ尪�� ������ �� ����ϴ� �޼ҵ�
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

	// setter �޼ҵ� --> �ʵ忡 �ִ� ���� ������ �� ����ϴ� �޼ҵ�
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
	
	
	
	
	
	
	
	
}

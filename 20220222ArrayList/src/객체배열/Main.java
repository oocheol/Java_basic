package ��ü�迭;

public class Main {

	public static void main(String[] args) {
		// ��ü�迭
		// ��ü -> ������ �ڷ���
		// �������� ��ü�� �ϳ��� ���������� ����
		// Pokemon 3�� ������ �� �ִ� bag ����
		Pokemon[] bag = new Pokemon[3];
		
		System.out.println(bag);
		System.out.println(bag[0]);
		// 0��° �濡 ��ī�� �����ؼ� �־��ּ���
		// ����, ��ī��, 2000, �鸸��Ʈ, 500
		
		// 1. ���ϸ� �����ϱ�
//		Pokemon pika = new Pokemon("����", "��ī��", 2000, "�鸸��Ʈ", 500);
		
		// 2. ������ ���ϸ��� 0���濡 �����ֱ�
		bag[0] = new Pokemon("����", "��ī��", 2000, "�鸸��Ʈ", 500);

		// Pokemon�� ��� ����Ǿ� �ִ����� ��Ÿ���� �ּҰ�
		System.out.println(bag[0]);
		
		// �鸸��Ʈ ��ų�� ���
		System.out.println(bag[0].getSkill());
		
		
		
		
	}

}

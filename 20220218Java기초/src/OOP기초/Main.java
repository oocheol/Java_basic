package OOP����;

public class Main {

	public static void main(String[] args) {
		// ����Ǵ� ����
		// 1. ���赵���� ������ ��ü�� ����
		// ���赵�� �̸�
		Person jayeon = new Person();
		// new -> ���۷��� ���� ���� Ű����
		
		jayeon.breath();
		jayeon.name = "���ڿ�";
		
		System.out.println(jayeon.name);
		
		jayeon.age = 3;
		jayeon.gender = 'F';
		
		System.out.println(jayeon.age);
		System.out.println(jayeon.gender);
		
		// ������ ���赵���� ������ �������� ��ü���������ϴ�.
		// Person jiyoung
		
		Person jiyoung = new Person();
		jiyoung.name = "������";
		jiyoung.gender = 'F';
		jiyoung.age = 23;
		
		System.out.println(jiyoung.name);
		System.out.println(jiyoung.gender);
		System.out.println(jiyoung.age);
		
		
	}

}

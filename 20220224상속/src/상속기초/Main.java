package ��ӱ���;

public class Main {

	public static void main(String[] args) {
		// �������
		
		// 1. Parent ���赵�� ������� p ��ü ����
		Parent p = new Parent();
		
		// 2. Child ���赵�� ������� c ��ü ����
		Child c = new Child();
		
		// p�� �丶�� �Ľ�Ÿ�� �����.
		p.makePasta();
		
		// c�� �丶�� �Ľ�Ÿ�� �����.
		c.makePasta();
		
		// �ڽ��� �޼ҵ� �������̵��� �ߴٸ� �������̵� �� ����� ����ϰ� �ȴ�.
		c.makeCream();
		
		
		
		////////////////////////////////
		// ���۷��� ������ ����ȯ
		// ---> ����� �����Ǿ��־�� �Ѵ�.
		// 1. Upcasting
		// -> �ڽ� Ŭ������(����, ����) �θ�Ŭ����(����, ����)�� �ڵ�����ȯ
		// Parent
		Parent parent = new Child();
		// Ư¡!
		// �ڽ�Ŭ������ �θ�Ŭ������ �޼ҵ带 �������̵��� ��쿡��!
		// �ڽ�Ŭ������ �������̵��� �޼ҵ带 ����Ѵ�.
		parent.makeCream();
		
		// 2. downcasting
		// : �θ�Ŭ������ �ڽ�Ŭ������ ��������ȯ
		// --> ��ĳ���õ� ��ü�� ���ؼ��� ��밡���ϴ�.�ڡڡڡڡڡڡڡڡ�
		// --> ��ĳ���õ� ��ü�� �ٽ� �ڽ��� ������Ÿ������ �ǵ��ƿ��� ��
		Child child = (Child) parent;
		child.makeBbang();
		
		
//		Child child = (Child) new Parent();
		
		// --> ClassCastException �߻�!
		// Exception�̶�?
		// �������� ����(Syntax Error)�� ������,
		// �������� �� ���ܻ�Ȳ�� �߻��ϴ� ��!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

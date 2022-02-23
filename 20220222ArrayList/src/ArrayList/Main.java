package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList
		// �迭�� ������ ���¸� ���� Ŭ����
		// 1) ũ�Ⱑ �������̴�.
		// 2) ���۷��� ������ ���尡���ϴ�. (��ü�� ����) 
		// --> Ư���� ������� ���赵���� ����Ǿ� ����
		// �⺻�ڷ��� --> ���۷��� ����(Wrapper class)
		// --> �ձ��ڸ� �빮�ڷ�!
		// int�� 'Integer' (int�� ���۷�����)
		
		// <> --> ���׸����(Generic)
		// : Ŭ���� ���ο��� ����� �ڷ����� �ܺο��� �����ϴ� ���
		ArrayList<String> list = new ArrayList<String>(); 
		
		// 1. ������ �߰�
		list.add("�Ұ��");
		list.add("������ä");
		list.add("�����ʹ�");
		
		// 2. ������ ��������
		System.out.println(list.get(1));
		
		// 3. ������ �����ϱ�
		list.remove(0); // �Ұ�� �����
		
		System.out.println(list.get(1));
		
		// 4. ������ Ư����ġ�� �߰��ϱ�
		list.add(0,"������");
		
		System.out.println(list.get(0));
		
		// 5. ��� ������ ���
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// 6. ��� ������ �����ϱ�
		list.clear();
		
		System.out.println(list.size());
		
		
		
		
		
		
		
	}

}

package �л�����;

public class StuMain {

	public static void main(String[] args) {

		// 1. ��ü ����
		// ���赵�� ������ ����
		Student ��öȣ = new Student("��öȣ", "20224206"
									, 20, 100, 50, 100);
		
//		// 2. ������ ��ü �����Ϳ� �����ϱ�(���赵)
//		��öȣ.name = "��öȣ";
//		��öȣ.age = 20;
//		��öȣ.studentNumber = "20224206";
//		��öȣ.javaScore = 100;
//		��öȣ.webScore = 50;
//		��öȣ.androidScore = 100;
		System.out.println(��öȣ.name);
		
		// ������
		
		Student ������ = new Student("������", "20224606"
									, 23, 100, 500, 80);
				
		������.show();
		
	}

}

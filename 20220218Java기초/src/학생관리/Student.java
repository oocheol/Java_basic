package �л�����;

public class Student {

	// �л����� ������ ������ �� �ִ� ���赵
	// ���赵�� ���踸 ������ �� �����Ƿ�
	// ��ü�� �����ϴ� main()�� �ʿ䰡 ����.
	
	// 1. �ʵ�(Field)
	// �̸�, �й�(String), ����, Java����, Web����, Android����
	String name;
	String studentNumber;
	int age;
	int javaScore;
	int webScore;
	int androidScore;
	
	// ������ �޼ҵ� �����ϱ�
	// ��ü�� ������ �� Field�� �ִ� �����͸� �ʱ�ȭ ��ų �� �ִ� �޼ҵ�
	// ������(constructor)
	// 1) �����ڵ� �޼����̴�.
	// 2) �޼����� �̸��� Ŭ������ �̸��� ������ �̸��� ���´�.
	// 3) ����Ÿ���� �������� �ʴ´�.
	// 4) �Ű������� �ƹ��͵� ���� �ʴ� �����ڸ� �⺻�����ڶ�� �θ���.
	// ----> �⺻ �����ڴ� ������ �����ϴ�.
	// ----> ��, ���ο� �����ڸ� ����ٸ� �⺻�����ڴ� ���������.
	// �����ڸ� �����ε� ---> �ߺ�����
	// �Ű������� ������ Ÿ���� �ٸ��� �ؼ� �ߺ����� �����ϴ� ��
	// �޼ҵ� �����ε�
	
	public Student(String name, String studentNumber, int age, 
			int javaScore, int webScore, int androidScore) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.age = age;
		this.javaScore = javaScore;
		this.webScore = webScore;
		this.androidScore = androidScore;
		
		// this => ���� �� Ŭ������ ��Ī!
		// this => Ŭ���� �� �ڽ��� �⸮Ű�� Ű����!!!
		
	}
	
	
	
	
	
	
	
	// 2. �޼���(Method)
	// show() �޼ҵ� ���� -> �Ϲݸ޼���
	// ���������� ����Ÿ�� �޼ҵ� �̸� �Ű�����
	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���.");
	}
	
	
	
}

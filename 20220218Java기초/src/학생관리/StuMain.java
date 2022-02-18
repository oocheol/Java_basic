package 학생관리;

public class StuMain {

	public static void main(String[] args) {

		// 1. 객체 생성
		// 설계도면 가지고 오기
		Student 배철호 = new Student("배철호", "20224206"
									, 20, 100, 50, 100);
		
//		// 2. 생성된 객체 데이터에 접근하기(설계도)
//		배철호.name = "배철호";
//		배철호.age = 20;
//		배철호.studentNumber = "20224206";
//		배철호.javaScore = 100;
//		배철호.webScore = 50;
//		배철호.androidScore = 100;
		System.out.println(배철호.name);
		
		// 오형석
		
		Student 오형석 = new Student("오형석", "20224606"
									, 23, 100, 500, 80);
				
		오형석.show();
		
	}

}

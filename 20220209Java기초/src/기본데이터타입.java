
public class 기본데이터타입 {

	public static void main(String[] args) {

		// ctrl + d : 한줄 지우기
		// 1. 논리형
		// boolean : 1byte or 1bit
		// 참 또는 거짓
		// true or false
		
		// 지금 더운 상태를 정하는 변수
		boolean isHot = true; // false
		// boolean a = 1;
		
		
		// 2. 문자형
		// char : 2byte -> 16bit => 2^16
		// 모든 유니코드 문자 표현 가능
		// char 문자를 대입하기 위해서는 ''로 감싸줘야합니다!
		char grade = 'A';
		System.out.println(grade);
		
		// 3. 정수형
		// byte : 1byte = 8bit => 2^8 => 256개
		// ( -128 ~ 127 )
		byte age = 20;
		// byte age2 = -129;
		
		// short : 2byte = 16bit = 2^16
		short num = 7000;
		System.out.println(num);
		
		// int : 4byte = 32bit = 2^32
		int num2 = 200000000;
		System.out.println(num2);
		
		// long : 8byte = 64bit = 2^64
		long num3 = 430000000;
		System.out.println(num3);
		
		
		// 4. 실수형
		// double : 기본
		double f = 3.14;
		System.out.println(f);
		
		// float
		// float f1 = 3.14f;
		// 명시적 형변환 == 강제 형변환
		float f1 = (float) 3.14;
		
		// 자동 형변환 == 묵시적 형변환
		double f2 = f1;
		
	}
	

}

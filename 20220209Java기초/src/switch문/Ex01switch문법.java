package switch문;

public class Ex01switch문법 {

	public static void main(String[] args) {

		// switch - case 문
		// --> 조건이 여러개일때 사용하는 조건문!
		// 홀수인지, 짝수인지 비교해보자!
		int num = 4;
		// 특징!
		// switch문 안쪽에서 case가 한번이라도 true가 된다면
		// 해당하는 구문이 끝날때까지 true인 상태가 유지된다!
		
		switch(num % 2) { // ()안에는 딱 떨어지는 값을 집어넣어야 한다!
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		default : 
		//--> if문에서 else역할처럼 
		//위의 조건이 모두 false였을 때 실행되는 구문
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

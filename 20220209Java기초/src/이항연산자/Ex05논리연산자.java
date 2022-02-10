package 이항연산자;

public class Ex05논리연산자 {

	public static void main(String[] args) {
		
		// 창이 사라지면 
		// window -> show view -> console
		// 1) 부정연산자 ---> !(피연산자)
		boolean result = true;
		System.out.println(!result); //false
		// 2) AND 연산자 ---> &&
		// 두개의 항이 모두 true일때만 true 결과값을 돌려주는 연산자
		
		int num1 = 4;
		int num2 = 5;
		
		boolean result2 = (num1 > num2) && (num1 < num2);
		// num1 > num2 ==> false
		// num1 < num2 ==> true
		// false && true ==> false
		System.out.println(result2);
		
		// 3) OR 연산자 ---> ||
		// shift + 원화표시 ===> ||
		// 두 개의 항 중에서  
		// 하나라도 true라면 true결과값을 돌려주는 연산자
		// 두 개의 항이 모두 false이면 false를 돌려준다.
		boolean result3 = (num1 > num2) || (num1 < num2);
		// false || true ---> true
		System.out.println(result3);
		
		boolean result4 = (num1 > num2) || (num1 == num2);
		// false || false ---> false
		System.out.println(result4);
		
		
		
		
	}

}

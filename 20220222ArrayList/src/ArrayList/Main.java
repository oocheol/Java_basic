package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList
		// 배열과 유사한 형태를 갖는 클래스
		// 1) 크기가 가변적이다.
		// 2) 레퍼런스 변수만 저장가능하다. (객체만 저장) 
		// --> 특이한 기법으로 설계도면이 설계되어 있음
		// 기본자료형 --> 레퍼런스 변수(Wrapper class)
		// --> 앞글자를 대문자로!
		// int만 'Integer' (int의 레퍼런스형)
		
		// <> --> 제네릭기법(Generic)
		// : 클래스 내부에서 사용할 자료형을 외부에서 지정하는 기법
		ArrayList<String> list = new ArrayList<String>(); 
		
		// 1. 데이터 추가
		list.add("소고기");
		list.add("고추잡채");
		list.add("연어초밥");
		
		// 2. 데이터 가져오기
		System.out.println(list.get(1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

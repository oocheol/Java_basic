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
		
		// 3. 데이터 삭제하기
		list.remove(0); // 소고기 지우기
		
		System.out.println(list.get(1));
		
		// 4. 데이터 특정위치에 추가하기
		list.add(0,"탕수육");
		
		System.out.println(list.get(0));
		
		// 5. 모든 데이터 출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// 6. 모든 데이터 삭제하기
		list.clear();
		
		System.out.println(list.size());
		
		
		
		
		
		
		
	}

}

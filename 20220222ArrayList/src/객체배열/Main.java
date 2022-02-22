package 객체배열;

public class Main {

	public static void main(String[] args) {
		// 객체배열
		// 객체 -> 나만의 자료형
		// 여러개의 객체를 하나의 변수명으로 관리
		// Pokemon 3개 저장할 수 있는 bag 생성
		Pokemon[] bag = new Pokemon[3];
		
		System.out.println(bag);
		System.out.println(bag[0]);
		// 0번째 방에 피카츄 생성해서 넣어주세요
		// 번개, 피카츄, 2000, 백만볼트, 500
		
		// 1. 포켓몬 생성하기
//		Pokemon pika = new Pokemon("번개", "피카츄", 2000, "백만볼트", 500);
		
		// 2. 생성한 포켓몬을 0번방에 집업넣기
		bag[0] = new Pokemon("번개", "피카츄", 2000, "백만볼트", 500);

		// Pokemon이 어디 저장되어 있는지를 나타내는 주소값
		System.out.println(bag[0]);
		
		// 백만볼트 스킬을 출력
		System.out.println(bag[0].getSkill());
		
		
		
		
	}

}

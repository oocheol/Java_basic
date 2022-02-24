package 인형뽑기;

public class Main {

	public static void main(String[] args) {

		// 1. 인형뽑기 기계 생성
		Machine m = new Machine();
		
		// 피카츄 인형 생성
		m.start(new Pika());
		
		m.start(new Mu());
		m.start(new Kkobuk());
		
		// Doll p = new Kkobuk();
		// ---> 업캐스팅
		// ---> Kkobuk이 Doll의 pick 메소드를 오버라이딩(재정의)했기 때문에
		// ---> 꼬부기 인형이 뽑힌다.
		
		// 빨간줄을 해결!
		// 단, Main 클래스는 코드수정을 하지 말고!
		// 방법은 2가지!!! 조금 더 효율적인 방법은 무엇일지 고민해보기!
		
		
	}

}

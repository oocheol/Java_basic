package 인터페이스;

public class Agumon implements Digimon, DigimonShield{

	// 인터페이스 키워드 : implements
	@Override
	public String attack() {
		return "아구몬이 공격한다~!!!!";
	}

	@Override
	public String specialAttack() {
		return "아구몬이 특수공격한다@@~!!!!";
	}

	@Override
	public String shield() {
		return "아구몬이 방어한다##";
	}
	
	// 인터페이스도 강제적으로 구현을 요청한다
	// 인터페이스는 다중 상속이 가능!!!!
	
	// 자바 버전이 업그레이드
	// 자바 버전이 낮은 ---> 추상클래스 다중상속x
	// 지비 버전이 높은 ---> 추상클래스 다중상속o

	
	
	
	
}

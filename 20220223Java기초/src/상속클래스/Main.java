package 상속클래스;

public class Main {

	public static void main(String[] args) {

		// Mouse 설계도를 가지고오자!
		Mouse ms = new Mouse();
		
		// 기능
		ms.leftClick();
		
		// WheelMouse 설계도를 가지고오자
		WheelMouse wms = new WheelMouse();
		
		// 기능
		wms.drag();
		
		wms.scroll();
		
		
		
		
		
		
		
	}

}

package Question2;

public class Tv {
	int channel;
	String color;
	
	public void print() {
		System.out.println("Tv�� ���� ä���� : "
	+ channel + "�̰�, Tv ������ " 
	+ color + " �Դϴ�.");
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
	
}

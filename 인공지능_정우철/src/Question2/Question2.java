package Question2;

public class Question2 {

	public static void main(String[] args){
		Tv t = new Tv();
		
		t.channel = 7;
		t.color= "red";
		t.print();
		t.channelUp();
		t.channelUp();
		t.print();
		t.color= "black";
		t.channelDown();
		t.print();
		}

}

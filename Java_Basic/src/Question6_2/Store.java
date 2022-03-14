package Question6_2;

public abstract class Store {

	protected String name;
	protected String event;
	protected double price;
	
	public Store(String name, String event, double price) {
		this.name = name;
		this.event = event;
		this.price = price;
	}



	public abstract double grade();

}

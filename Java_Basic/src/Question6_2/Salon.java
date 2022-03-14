package Question6_2;

public class Salon extends Store {

	private double technology;
	private double kindness;

	public Salon(String name, String event, double technology, double kindness, double price) {
		super(name, event, price);
		this.technology = technology;
		this.kindness = kindness;
	}

	@Override
	public double grade() {
		double temp = (technology + kindness + price) / 3;
		double result = Math.round(temp * 100) / 100.0;

		return result;
	}

	public double getTechnology() {
		return technology;
	}

	public void setTechnology(double technology) {
		this.technology = technology;
	}

	public double getKindness() {
		return kindness;
	}

	public void setKindness(double kindness) {
		this.kindness = kindness;
	}

}

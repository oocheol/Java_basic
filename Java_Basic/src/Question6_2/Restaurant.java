package Question6_2;

public class Restaurant extends Store {
	private double service;
	private double flavor;
	private double clean;

	public Restaurant(String name, String event, double service, double flavor, double clean, double price) {
		super(name, event, price);
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}

	@Override
	public double grade() {
		double temp = (service + flavor + clean + price) / 4;
		double result = Math.round(temp * 100) / 100.0;

		return result;
	}

	public double getService() {
		return service;
	}

	public void setService(double service) {
		this.service = service;
	}

	public double getFlavor() {
		return flavor;
	}

	public void setFlavor(double flavor) {
		this.flavor = flavor;
	}

	public double getClean() {
		return clean;
	}

	public void setClean(double clean) {
		this.clean = clean;
	}

}

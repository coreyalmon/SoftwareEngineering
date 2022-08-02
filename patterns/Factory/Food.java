package DataAccessLayer;

public abstract class Food {
	
	private double price;
	private String name;

	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
}

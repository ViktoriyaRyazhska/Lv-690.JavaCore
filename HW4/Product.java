package Homework4;

public class Product {
	private String name;
	private double price;
	private double qty;
	public Product(String name, double price, double qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {		
		return name;
	}
	public double getPrice() {		
		return price;
	}
	public double getQty() {		
		return qty;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	
}

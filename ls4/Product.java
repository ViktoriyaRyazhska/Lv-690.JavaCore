package ls4;

import java.util.ArrayList;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	static ArrayList<Product> arrayOfProducts = new ArrayList<>();
	
	
	public Product(String name, double price, int quantity) {		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		arrayOfProducts.add(this);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name= " + name + ", price= " + price + ", quantity= " + quantity + "]";
	}
		
	public String printNameQuantity() {
		return "name= " + name + ", quantity= " + quantity;
	}
	
	public String printName() {
		return "name= " + name;
	}
	
	public static void nameQuantityOfExpenciveProduct() {
		Product p = arrayOfProducts.get(0);
		for (int i = 1; i < arrayOfProducts.size(); i++) {
			if (p.getPrice() < arrayOfProducts.get(i).getPrice()) {
				p = arrayOfProducts.get(i);
			}
		}
		System.out.println("The expencive produkt " + p.printNameQuantity());
	}
	
	public static void biggestQuantityOfItem() {
		Product p = arrayOfProducts.get(0);
		for (int i = 1; i < arrayOfProducts.size(); i++) {
			if (p.getQuantity() < arrayOfProducts.get(i).getQuantity()) {
				p = arrayOfProducts.get(i);
			}
		}
		System.out.println("The biggest quantity has product " + p.printName());
	}
		
}

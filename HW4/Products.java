package Homework4;

public class Products {
	private Product[] products;
	public Products(Product[] products) {
		this.products = products;
	}
	
	public void PrintMostExpensive() {
		if (products.length==0) {return;}
		;
		Sort(1);
		System.out.println("Most expensive is "+products[0]);

		
	}
	public void PrintBiggestQty() {
		if (products.length==0) {return;}
		;
		Sort(2);
		System.out.println("Biggest quantity is "+products[0]);
		
	}
	
	private boolean Compare(Product product1, Product product2, int By) {
		if (By == 1) {
			return (product1.getPrice()>product2.getPrice()); 				
			};
		if (By == 2) {
			return (product1.getQty()>product2.getQty()); 				
			};
			return true;
	}
	
	private void Sort(int By) {
		if (products.length<2) {return;}
		;
		Product product1;
		Product product2;
		boolean sorted;
		do{ 
			sorted = true;
			for (int i = 1; i < products.length; i++) {
				product1 = products[i-1];
				product2 = products[i];
				if (Compare(product1, product2, By)==false) {
					products[i-1] = product2;
					products[i] = product1;
					sorted=false;
				}			
			}
		}while (sorted==false);
	}
	
}

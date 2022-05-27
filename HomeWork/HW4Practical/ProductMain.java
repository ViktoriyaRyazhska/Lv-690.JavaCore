//Create class Product with fields name, price and quantity.
//Create four instances of type Product. 
//Display the name and quantity of the most expensive item.
//Display the name of the items, which has the biggest quantity.

package HW4Practical;

public class ProductMain {
	public static void main(String[] args) {

        Product p1 = new Product("Water", 5, 10);
        Product p2 = new Product("Bear", 15, 23);
        Product p3 = new Product("Wine", 55, 3);
        Product p4 = new Product("Whisky", 105, 5);


        System.out.println(Product.getBiggestPrice (p1, Product.getBiggestPrice(p2, Product.getBiggestPrice(p3, p4))).GetInfo1());
        System.out.println(Product.getBiggestQuantity (p1, Product.getBiggestQuantity(p2, Product.getBiggestQuantity(p3, p4))).GetInfo2());
 
    }
}

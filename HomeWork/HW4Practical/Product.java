//Create class Product with fields name, price and quantity.
//Create four instances of type Product. 
//Display the name and quantity of the most expensive item.
//Display the name of the items, which has the biggest quantity.

package HW4Practical;

public class Product {

    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public static Product getBiggestPrice(Product prod1, Product prod2) {
        return prod1.price > prod2.price ? prod1 : prod2;
       
    }

    public static Product getBiggestQuantity(Product prod1, Product prod2) {
        return prod1.quantity > prod2.quantity ? prod1 : prod2;
    }

    @Override
    public String toString() {
        return "Product:" + name + ":Price:" + price + ":Quantity:" + quantity;
    }

    public String GetInfo1() {
        return "Most expensive item: Name:" + name + ":Quantity:" + quantity;
    }

    public String GetInfo2() {
        return "Biggest quantity: Name:" + name + ":Price:" + price;
    }
}


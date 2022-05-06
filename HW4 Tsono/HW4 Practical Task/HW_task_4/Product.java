package HW_task_4;
//        Create class Product with fields name,price and quantity.
//        Create four instances of type Product.
//        Display the name and quantity of the most expensive item.
//        Display the name of the items, which has the biggest quantity.


public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getInfoNameQuantity() {
        return "Найдорожча річ це " + name + " і кількість - " + quantity + ".";
    }

    public String getInfoName() {
        return "Назва товару на складі відносно його кількості. Найбільша кількість на складі - " + name + ".";
    }

    public static Product mostExpensiProduct(Product product1, Product product2) {
        return product1.price > product2.price ? product1 : product2;
    }

    public static Product biggestQuantity(Product product1, Product product2) {
        return product1.quantity > product2.quantity ? product1 : product2;
    }


}


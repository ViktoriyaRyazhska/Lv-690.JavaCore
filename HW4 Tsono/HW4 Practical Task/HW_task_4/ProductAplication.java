package HW_task_4;
//        Create class Product with fields name,price and quantity.
//        Create four instances of type Product.
//        Display the name and quantity of the most expensive item.
//        Display the name of the items, which has the biggest quantity.

public class ProductAplication {
    public static void main(String[] args) {
        Product product1 = new Product("Iphone", 1000, 3);
        Product product2 = new Product("TV", 2000, 2);
        Product product3 = new Product("Dayson", 600, 4);
        Product product4 = new Product("Pianino", 3000, 10);
        System.out.println(Product.mostExpensiProduct(product1, Product.mostExpensiProduct(product2, Product.mostExpensiProduct(product3, product4))).getInfoNameQuantity());
        System.out.println(Product.biggestQuantity(product1, Product.biggestQuantity(product2, Product.biggestQuantity(product3, product4))).getInfoName());
    }

}

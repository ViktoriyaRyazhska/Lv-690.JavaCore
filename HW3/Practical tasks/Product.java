package JavaCore;

public class Product {

    public String name;
    public double price;
    public  int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {

        Product pr1 = new Product("phone",5000,1);
        Product pr2 = new Product("pen",50,10);
        Product pr3 = new Product("table",2000,2);
        Product pr4 = new Product("toy",6000,5);

        double maxPrice=0;

        if (pr1.getPrice() > maxPrice ) {
            maxPrice = pr1.getPrice();
        }
        if (pr2.getPrice() > maxPrice ) {
            maxPrice = pr2.getPrice();
        }
        if (pr3.getPrice() > maxPrice ) {
            maxPrice = pr3.getPrice();
        }
        if (pr4.getPrice() > maxPrice ) {
            maxPrice = pr4.getPrice();
        }

        if (pr1.getPrice() == maxPrice ) {
            System.out.println("The most expensive product is "+pr1.getName()+", quan. - "+pr1.getQuantity());
        }
        if (pr2.getPrice() == maxPrice ) {
            System.out.println("The most expensive product is "+pr2.getName()+", quan. - "+pr2.getQuantity());;
        }
        if (pr3.getPrice() == maxPrice ) {
            System.out.println("The most expensive product is "+pr3.getName()+", quan. - "+pr3.getQuantity());;
        }
        if (pr4.getPrice() == maxPrice ) {
            System.out.println("The most expensive product is "+pr4.getName()+", quan. - "+pr4.getQuantity());;
        }

        int maxQuantity=0;

        if (pr1.getQuantity() > maxQuantity) {
            maxQuantity = pr1.getQuantity();
        }
        if (pr2.getQuantity() > maxQuantity ) {
            maxQuantity = pr2.getQuantity();
        }
        if (pr3.getQuantity() > maxQuantity ) {
            maxQuantity = pr3.getQuantity();
        }
        if (pr4.getQuantity() > maxQuantity ) {
            maxQuantity = pr4.getQuantity();
        }

        if (pr1.getQuantity() == maxQuantity ) {
            System.out.println("The biggest quantity has product "+pr1.getName());
        }
        if (pr2.getQuantity() == maxQuantity ) {
            System.out.println("The biggest quantity has product "+pr2.getName());
        }
        if (pr3.getQuantity() == maxQuantity ) {
            System.out.println("The biggest quantity has product "+pr3.getName());
        }
        if (pr4.getQuantity() == maxQuantity ) {
            System.out.println("The biggest quantity has product "+pr4.getName());
        }

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

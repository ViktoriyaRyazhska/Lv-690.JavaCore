package product;

public class product {

    private String name;
    private int price;
    private int quantity;

    public product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public static void BeaterPrice(product product1, product product2, product product3) {
        if (product1.price > product2.price && product1.price > product3.price) {
            System.out.println(product1.GetInfo1());
        }
        if (product2.price > product1.price && product2.price > product3.price) {
            System.out.println(product2.GetInfo1());
        }
        if (product3.price > product1.price && product3.price > product2.price) {
            System.out.println(product3.GetInfo1());
        }
    }

    public static void BiggestQuantity(product product1, product product2, product product3) {
        if (product1.quantity > product2.quantity && product1.quantity > product3.quantity) {
            System.out.println(product1.GetInfo2());
        }
        if (product2.quantity > product1.quantity && product2.quantity > product3.quantity) {
            System.out.println(product2.GetInfo2());
        }
        if (product3.quantity > product1.quantity && product3.quantity > product2.quantity) {
            System.out.println(product3.GetInfo2());
        }
    }

    //better code implementation

    public static product getBiggerPrice(product prod1, product prod2) {
        return prod1.price > prod2.price ? prod1 : prod2;
    }

    public static product getBiggerQuantity(product prod1, product prod2) {
        return prod1.quantity > prod2.quantity ? prod1 : prod2;
    }


}

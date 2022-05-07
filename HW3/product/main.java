package product;

public class main {
    public static void main(String[] args) {

        product prod1 = new product("Milk", 23, 10);
        product prod2 = new product("Bread", 12, 23);
        product prod3 = new product("Beacon", 63, 3);


        product.BeaterPrice(prod1, prod2, prod3);
        product.BiggestQuantity(prod1, prod2, prod3);
        System.out.println("------------");
        System.out.println("Most expensive item:" + product.getBiggerPrice(prod1, product.getBiggerPrice(prod2, prod3)));
        System.out.println("Biggest quantity:" + product.getBiggerQuantity(prod1, product.getBiggerQuantity(prod2, prod3)));
    }
}

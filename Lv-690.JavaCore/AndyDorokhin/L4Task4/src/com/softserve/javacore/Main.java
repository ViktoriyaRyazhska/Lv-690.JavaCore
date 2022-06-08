package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product tvSet = new Product("Samsung TV Set", 800, 10);
        Product mobilePhone = new Product ("Apple Iphone", 600, 50);
        Product notebook = new Product("Asus Notebook", 750, 15);
        Product microwaveOven = new Product("LG Microwave Oven", 250, 60);

        Product mostExpensiveProduct = getMostExpensive(tvSet, mobilePhone, notebook, microwaveOven);
        System.out.println("Most expensive product");
        System.out.println("Name: " + mostExpensiveProduct.getName());
        System.out.println("Quantity: " + mostExpensiveProduct.getQuantity());

        Product biggestQuantityProduct = getBiggestQuantity(tvSet, mobilePhone, notebook, microwaveOven);
        System.out.println("Biggest quantity product");
        System.out.println("Name: " + biggestQuantityProduct.getName());

    }


    private static Product getMostExpensive(Product ... products) {
        Product mostExpensive = new Product();
        for (Product product : products) {
            if (product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    private static Product getBiggestQuantity(Product ... products) {
        Product biggestQuantity = new Product();
        for (Product product : products) {
            if (product.getQuantity() > biggestQuantity.getQuantity()) {
                biggestQuantity = product;
            }
        }
        return biggestQuantity;
    }
}

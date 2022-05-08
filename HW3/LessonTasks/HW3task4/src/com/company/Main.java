package com.company;

public class Main {

    public static void main(String[] args) {
        Product mostExpensive;
        Product bgQuantity;



        Product IphoneX = new Product("IphoneX" , 7500 , 9 );
        Product Iphone11 = new Product("Iphone11" , 13650 , 6);
        Product Iphone12 = new Product("Iphone12" , 25000 , 12);
        Product Iphone13 = new Product("Iphone13" , 31000);

        mostExpensive = IphoneX;

        if (Iphone11.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = Iphone11;
        }
        if (Iphone12.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = Iphone12;
        }
        if (Iphone13.getPrice() > mostExpensive.getPrice()){
            mostExpensive = Iphone13;
        }




        bgQuantity = IphoneX;

        if (Iphone11.getQuantity() > bgQuantity.getQuantity()) {
            bgQuantity = Iphone11;
        }
        if (Iphone12.getQuantity() > bgQuantity.getQuantity()) {
            bgQuantity = Iphone12;
        }
        if (Iphone13.getQuantity() > bgQuantity.getQuantity()){
            bgQuantity = Iphone13;
        }

        System.out.println("Model: " + mostExpensive.getName() + " ,quantity: " + mostExpensive.getQuantity());
        System.out.println(bgQuantity.getName());



    }
}

package com.controls;

public class whiledo {
    public static void main(String[] args) {
        int finalBalance = 100000;
        double curentBalance = 0;
        int paymant = 10000;
        int years = 0;
        double interestRate = 0.1;

        while (curentBalance < finalBalance) {
            curentBalance += paymant;
            curentBalance = curentBalance + curentBalance * interestRate;
            years++;
            System.out.println("Years" + years + " - " + curentBalance);
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter tariff for c1: ");
        float t1 = value.nextFloat();
        System.out.println("Enter call duration:");
        float m1 = value.nextFloat();

        System.out.println("Enter tariff for c2: ");
        float t2 = value.nextFloat();
        System.out.println("Enter call duration:");
        float m2 = value.nextFloat();

        System.out.println("Enter tariff for c3: ");
        float t3 = value.nextFloat();
        System.out.println("Enter call duration:");
        float m3 = value.nextFloat();

        float res1 = t1 * m1;
        float res2 = t2 * m2;
        float res3 = t3 * m3;

        System.out.println("Cost of first call: " + res1 + " y.o.");
        System.out.println("Cost of second call: " + res2 + " y.o.");
        System.out.println("Cost of third call: " + res3 + " y.o.");

//        float sum = res1 + res2 + res3;
//        System.out.println("Sum of all calls: " + sum);
    }
}

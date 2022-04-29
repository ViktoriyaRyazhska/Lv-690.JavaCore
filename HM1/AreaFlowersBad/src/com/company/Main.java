package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.println("enter radius of a flowers bad ");
        double r = radius.nextDouble();
        final double Pi = 3.1415926536;
        double area = Pi * (r*r);
        System.out.println("Area of a flowers bad = " + area);
    }
}

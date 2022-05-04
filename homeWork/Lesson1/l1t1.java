package Homework.lesson1;

import java.util.Scanner;

public class l1t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print radius.");
        double r = sc.nextDouble();
        final double pi = 3.14;
        System.out.println("Perimeter of your bed is " + (2*pi*r));
        System.out.println("Area of your bed is " + (pi* Math.pow(r,2)));
    }
}

package com.javalesson.chapter1.task1;

import java.util.Scanner;

public class TriangleSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 integer numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int biggest;
        if (a >= b) {
            biggest = a;
        } else {
            biggest = b;
        }
        if (c > biggest) {
            biggest = c;
        }


        if (biggest == a) {
            if (a >= b + c) {
                System.out.println("You cannot create a triangle with sides " + a + " " + b + " " + c);
            } else {
                System.out.println("You can create a triangle with sides " + a + " " + b + " " + c);
            }
        } else if (biggest == b) {
            if (b >= a + c) {
                System.out.println("You cannot create a triangle with sides " + a + " " + b + " " + c);
            } else {
                System.out.println("You can create a triangle with sides " + a + " " + b + " " + c);
            }
        } else {
            if (c >= a + b) {
                System.out.println("You cannot create a triangle with sides " + a + " " + b + " " + c);
            } else {
                System.out.println("You can create a triangle with sides " + a + " " + b + " " + c);
            }
        }
    }
}

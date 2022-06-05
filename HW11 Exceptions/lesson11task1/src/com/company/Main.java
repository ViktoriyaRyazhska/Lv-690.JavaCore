package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    static int area;

    public static void input() throws IncorrectExeption {
        try {
            a = sc.nextInt();
            b = sc.nextInt();
        } catch (InputMismatchException ex) {
            throw new IncorrectExeption("Exception: Incorrect value");
        }
    }

    public static void calculateArea() throws numberException {
        if (a <= 0 || b <= 0) {
            throw new numberException("Exception: incorrect side");
        }

        area = a * b;
        System.out.println("area is: " + area);
    }


    public static void main(String[] args) throws numberException {
        boolean correctInput = true;

        try {
            input();
        } catch (IncorrectExeption ex) {
            System.err.println(ex.getMessage());
            correctInput = false;
        }

        if (correctInput) {
            try {
                calculateArea();
            } catch (numberException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

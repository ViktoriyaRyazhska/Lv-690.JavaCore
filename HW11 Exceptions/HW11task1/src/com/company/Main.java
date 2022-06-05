package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static double a;
    static double b;
    static double div;

    public static void input() throws InputMismatchException {
        try {
            System.out.println("enter first number");
            a = sc.nextDouble();
            System.out.println("enter second number");
            b = sc.nextDouble();
        } catch (InputMismatchException ex) {
            throw new InputMismatchException("Exception: Incorrect number-format");
        }
    }

    public static void div() throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Exception: / by 0");
        }

        div = a / b;
        System.out.println(String.format("%.2f", div));
    }

    public static void main(String[] args) {
        boolean flag = true;

            try {
                input();
            } catch (InputMismatchException ex) {
                System.err.println(ex.getMessage());
                flag = false;
            }


        if(flag) {
            try {
                div();
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        // Create method div(), which calculates the dividing of two double numbers
        System.out.println("Please enter two numbers, separated by space (eg. 5.0 3.0): ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] userInput = br.readLine().split(" ");
            double x = Double.parseDouble(userInput[0]);
            double y = Double.parseDouble(userInput[1]);
            System.out.println(String.format("Result: %.2f", div(x,y)));

        } catch (IllegalArgumentException | ArithmeticException ex) {
            System.out.println(ex.getClass().getSimpleName() + " : " + ex.getMessage());
            ex.printStackTrace();
        }

    }

    private static double div(double x, double y) {
        if (y == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    }

}

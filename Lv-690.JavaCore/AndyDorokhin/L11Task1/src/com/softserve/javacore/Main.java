package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter rectangle dimensions, separated by space: ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] dimensions = br.readLine().split(" ");
            int sideA = Integer.parseInt(dimensions[0]);
            int sideb = Integer.parseInt(dimensions[1]);
            System.out.println("Rectangle square: " + squareRectangle(sideA,sideb));

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getClass().getSimpleName() + " : " + ex.getMessage());
        }
    }

    //Create a method for calculating the area of a rectangle
    public static int squareRectangle(int a, int b) throws IllegalArgumentException {

        int square = a*b;
        if (square > 0) {
            return square;
        } else {
            throw new IllegalArgumentException("Rectangle side must be a positive integer number.");
        }

    }
}

package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        //Write a method readNumber(int start, int end)
        //Using this method write a method main(), that has to enter 10 numbers

        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (numbers.size() < 10) {
                try {
                    numbers.add(readNumber(1, 100, br));
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getClass().getSimpleName() + " : " + ex.getMessage());
                }

            }

        }
        finally {
            System.out.println("Done!");
            System.out.println(numbers);
            System.out.println("Numbers added: " + numbers.size());

        }

    }

    private static int readNumber(int start, int end, BufferedReader br) throws IOException, IllegalArgumentException {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(String.format("Please enter integer number between %d and %d:", start, end));
        int result = Integer.parseInt(br.readLine());
        //br.close();

        if (result <= start || result >= end)
            throw new IllegalArgumentException(String.format("Number not in range: %d", result));

        return result;

    }

}

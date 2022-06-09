package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, IllegalArgumentException {

        // Ask user to enter the number of month, read the value and write the number of days
        System.out.println("Task 1");
        int[] daysInMonth = {31, 28, 31,30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Please enter month number, 1 to 12: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int month = Integer.parseInt(br.readLine());
            if (!(month >= 1 && month <= 12)) {
                System.out.println("Please provide valid month number, 1 to 12");
            } else {
                System.out.println("Days: " + daysInMonth[month - 1]);
            }
        }
        catch (NumberFormatException ex) {
            System.out.println("Please provide VALID INTEGER, 1 to 12");
            System.out.println(ex.getMessage());
        }

        // Enter 10 integer numbers...
        System.out.println("Task 2");
        int[] testArray1 = {2, 2, 2, 2, 2, 0, 0, 0, 0, 0};
        int[] testArray2 = {0, -1, 0, 0, 0, 2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(testArray1));
        System.out.println("Result: " + calculate(testArray1));
        System.out.println(Arrays.toString(testArray2));
        System.out.println("Result: " + calculate(testArray2));

        // Enter 5 integer numbers, find position of second positive, minimum and its position
        System.out.println("Task 3");
        int[] testArray3 = {0, 1, -1, 2, 3};
        System.out.println(Arrays.toString(testArray3));
        findSecondPositiveIndex(testArray3);
        findMinimum(testArray3);
        int[] testArray4 = {-1, 1, -1, -1, -1};
        System.out.println(Arrays.toString(testArray4));
        findSecondPositiveIndex(testArray4);
        findMinimum(testArray4);
    }

    private static void findMinimum(int[] numbers) {
        int pos = 0;
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                pos = i;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("found at index: " + pos);
    }

    private static int findSecondPositiveIndex(int[] numbers) {
        int positiveCount = 0;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            }
            if (positiveCount == 2) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Not enough positive numbers in array");
        } else {
            System.out.println("Found second positive numbers at index: " + index);
        }

        return index;
    }

    private static int calculate(int[] numbers) {

        if (numbers.length != 10) {
            throw new IllegalArgumentException("Wrong array length: " + numbers.length);
        }

        int positiveCount = 0;
        int sum = 0;
        int product = 1;

        for (int i = 0; i < 5; i++) {
            if(numbers[i] > 0) {
                sum += numbers[i];
                positiveCount++;
            } else {
                break;
            }
        }

        if (positiveCount == 5) {
            System.out.println("Calculating sum of first 5 elements... ");
            return sum;
        }

        // calculate product of last 5 elements
        for(int i = 5; i < numbers.length; i++) {
            product *= numbers[i];
        }
        System.out.println("Calculating product of last 5 elements... ");
        return product;
    }
}

package com.softserve.javacore;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Create an array of ten integers
        int[] myArray = {0, 7, -15, 6, 4, -22, 0, 11, 55, 1};

        int max = findMax(myArray);
        int sum = sumPositeive(myArray);
        int count = countNegative(myArray);

        System.out.println(Arrays.toString(myArray));

        System.out.println("Biggest number: " + max);
        System.out.println("Sum of positive numbers:  " + sum);
        System.out.println("Amount of negative numbers:  " + count);
        System.out.println("Amount of positive and 0s:  " + (myArray.length - count));


    }

    private static int findMax(int[] myArray) {
        int max = myArray[0];
        for (int num : myArray) {
            max = num > max ? num : max;
        }
        return max;
    }

    private static int sumPositeive(int[] myArray) {
        int sum = 0;
        for (int num : myArray) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    private static int countNegative(int[] myArray) {
        int count = 0;
        for (int num : myArray) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

}

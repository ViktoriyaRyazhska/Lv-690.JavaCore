package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int oddCounter = 0;
        int[] numbers = {13, 17, 22};
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCounter++;
            }
        }
        System.out.println(String.format("Odd numbers: %d", oddCounter));

    }

}

package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        do{
            System.out.println("Enter number of task (1 2 4 5 6 9 10 12)");
            Scanner sc = new Scanner(System.in);

            int sw = sc.nextInt();

            switch (sw) {
                case 1:
                    System.out.println("Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                    Task1.generateFibonacci(print());
                    break;
                case 2:
                    System.out.println("Input number and decompose this number into a product of prime numbers with their degrees ");
                    Task2.decomposeNumber(print());
                    break;
                case 4:
                    System.out.println("Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)");
                    Task4.execute();
                    break;
                case 5:
                    System.out.println("Input string and check if this string is palindrome (e.g. “ABCCBA”)");
                    Task5.execute();
                    break;
                case 6:
                    System.out.println("Input text and calculate number of words in this text");
                    Task6.execute();
                    break;
                case 9:
                    System.out.println("Write method to return random value 0 or 1. Input number n,\n" +
                            " call this method n times and calculate how many times were number one\n");
                    Task9.execute();
                    break;
                case 10:
                    System.out.println("Find the number of steps for which you get 1, using the following process: we take any\n" +
                            "the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then\n" +
                            "multiply by 3 and add 1\n");
                    Task10.executeTask10();
                case 12:
                    System.out.println("If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.\n " +
                            "The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.\n");
                    Task12.executeTask12();
                    break;
            }
        }while (true);

    }
    public static int print (){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
}



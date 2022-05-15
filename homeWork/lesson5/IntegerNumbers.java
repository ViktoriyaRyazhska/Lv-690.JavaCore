package Homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i < 5 && numbers[i] > 0) {
                sum += numbers[i];
            } else {
                prod *= numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
        System.out.println(prod);
    }
}

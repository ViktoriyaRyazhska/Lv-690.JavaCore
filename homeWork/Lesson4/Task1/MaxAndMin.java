package Homework.lesson4;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int ex : numbers) {
            max = Math.max(max, ex);
            min = Math.min(min, ex);
        }
        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
    }
}

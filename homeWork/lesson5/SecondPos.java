package Homework.lesson5;

import java.util.Scanner;

public class SecondPos {
    private static int[] numbers = new int[5];
    private static int min = 0;
    private static int index = 0;
    private static int prod = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void fillArray() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] < 0) {
                System.out.println("Negative number!");
                numbers[i] = 0;
                break;
            }
        }
    }

    public static void getProd() {
        for (int elem : numbers) {
            if (elem > 0 && elem % 2 == 0) {
                prod *= elem;
            }
        }
        System.out.println("Product of all positive number grater than 0 is " + prod);
    }

    public static void getSecPos() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                index = i + 1;
                break;
            }
        }

        for (; index < numbers.length; index++) {
            if (numbers[index] > 0) {
                System.out.println("Second positive number is " + numbers[index] + " and have index " + index);
                break;
            } else {
                System.out.println("Only 1 positive number!");
            }
        }
    }

    public static void getMin() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }

        System.out.println("Minimum number is " + min + " and have index " + index);
    }

    public static void main(String[] args) {

        SecondPos.fillArray();
        SecondPos.getSecPos();
        SecondPos.getMin();
        SecondPos.getProd();

    }
}

package lesson3;

import java.util.Scanner;

public class Praktika {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean belongRange1 = false;
        boolean belongRange2 = false;
        boolean belongRange3 = false;
        System.out.println("Number1: ");
        double num = console.nextDouble();

        if (num >= -5 && num <= 5) {
            belongRange1 = true;
        }

        System.out.println("Number2: ");
        double num2 = console.nextDouble();
        if (num2 >= -5 && num2 <= 5) {
            belongRange2 = true;
        }

        System.out.println("Number3: ");
        double num3 = console.nextDouble();
        if (num3 >= -5 && num3 <= 5) {
            belongRange3 = true;
        }
        if (belongRange1 && belongRange2 && belongRange3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}














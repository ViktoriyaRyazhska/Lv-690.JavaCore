package HW3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean toNumber1 = false;
        boolean toNumber2 = false;
        boolean toNumber3 = false;

        System.out.print("Enter the first number:");
        float number1 = console.nextFloat();
        System.out.print("Enter the second number:");
        float number2 = console.nextFloat();
        System.out.print("Enter the third number:");
        float number3 = console.nextFloat();

        if (number1 >= -5 && number1 <= 5) {
            toNumber1 = true;
        }
        if (number2 >= -5 && number2 <= 5) {
            toNumber2 = true;
        }
        if (number3 >= -5 && number3 <= 5) {
            toNumber3 = true;
        }
        if (toNumber1 && toNumber2 && toNumber3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

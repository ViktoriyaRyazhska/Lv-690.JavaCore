package HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max;
        int min;
        int temp;

        System.out.print("Enter the first number:");
        int number1 = console.nextInt();
        System.out.print("Enter the second number:");
        int number2 = console.nextInt();
        System.out.print("Enter the third number:");
        int number3 = console.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            max = number1;
            System.out.println("max: " + max);
            {
                if (number2 >= number3)
                    min = number3;
                else min = number2;
                System.out.println("min: " + min);
            }
        }
        if (number2 >= number3 && number2 >= number1) {
            max = number2;
            System.out.println("max: " + max);
            {
                if (number3 >= number1)
                   min = number1;
                else min = number3;
                System.out.println("min: " + min);
            }
        }
        if (number3 >= number1 && number3 >= number2) {
            max = number3;
            System.out.println("max: " + max);
            {
                if (number1 >= number2)
                    min = number2;
                else min = number1;
                System.out.println("min: " + min);
            }
        }

    }
}


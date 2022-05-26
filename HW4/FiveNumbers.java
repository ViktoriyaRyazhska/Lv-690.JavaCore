package HW4;

import java.util.Scanner;

public class FiveNumbers {
    //Enter 5 integer numbers. Find position of second positive number;
    //minimum and its position in the array.
    //Organize entering integers until the first negative number. Count the product of all entered even numbers.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] a = new int[5];
        int l = a.length;
        int positionSecPos = 0;
        int numberOfPositive = 0;
        int minPosition = 0;
        int prod = 1;
        int i = 0;


        for (i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + " number:");
            a[i] = console.nextInt();
            if (a[i] < 0) {
                System.out.println("You entered the negative number. Input stops.");
                break;
            }
        }

        for( i=0;i < a.length;i++) {
            if (a[i] < a[minPosition]) {
                minPosition = i;
            }
        }
        System.out.println("Minimum is " + a[minPosition]+", placed "+(minPosition+1));

        for (i = 0; i < l; i++) {
            if (a[i] % 2 == 0) {
                prod = prod * a[i];
            }
        }
        System.out.println("Product of of all entered even numbers is: " + prod);


        for (i = 0; i < l; i++) {
            if (a[i] > 0 && numberOfPositive <= 2) {
                numberOfPositive++;
                positionSecPos = i;
            } else break;
        }
        System.out.println("Position of second positive number is: " + positionSecPos);

    }
}




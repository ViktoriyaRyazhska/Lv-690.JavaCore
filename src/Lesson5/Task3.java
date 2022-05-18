/*Enter 5 integer numbers.
Find position of second positive number;
minimum and its position in the array.
Count the product of all entered even numbers.*/

package Lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter integer number:");
            array[i] = console.nextInt();
        }
        int positivePosition = -1;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0 && positivePosition != -1) {
                positivePosition = i;
                break;
            }
            if (array[i] > 0) {
                positivePosition = i;
            }
        }
        System.out.println("Second positive number: " + positivePosition);
        int min = array[0];
        int minPosition = 0;
        for (int i = 1; i < 5; i++) {
            if (array[i] < min) {
                min = array[i];
                minPosition = i;
            }

        }
        System.out.println("Min= " + min + " Position= " + minPosition);

    }
}

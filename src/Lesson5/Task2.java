/*Enter 10 integer numbers.
Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
 */
package Lesson5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        boolean positiveItem = true;
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter integer number:");
            array[i] = console.nextInt();
            if (array[i] >= 0 && i < 5 && positiveItem) {
                sum = sum + array[i];
            } else if (array[i] < 0 && i < 5) {
                positiveItem = false;
            }
            if (i >= 5 && !positiveItem) {
                product = product * array[i];
            }
        }
        if (positiveItem) {
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Product: " + product);
        }

    }
}







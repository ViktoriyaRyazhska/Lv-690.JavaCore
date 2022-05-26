package HW4;

import java.util.Scanner;

public class SumNumber {
    //Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last
    //5 element in the other case.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        int prod = 1;
        int index = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i + 1) + " number:");
            a[i] = console.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (a[i] > 0) index++;
        }
        if (index==5) {
            for(int i=0; i<5; i++) {
                sum += a[i];}
                System.out.println("The sum of first 5 numbers is " + sum);}
            else for (int i = 5; i < 10; i++)
                prod = prod * a[i];
                System.out.println("Product of last 5 numbers is " + prod);

        }
    }

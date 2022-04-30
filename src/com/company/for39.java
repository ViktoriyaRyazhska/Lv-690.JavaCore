package com.company;

import java.util.Scanner;

public class for39 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите целое положительное число A:");
        int A = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Введите целое положительное число B:");
        int B = b.nextInt();

        int i, i2;
            for (i = A; i <= B; ++i) {
               for (i2=1; i2<=i; ++i2)
                System.out.println(i);
            }



    }
}

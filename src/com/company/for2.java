package com.company;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число A:");
        int A = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Введите число B:");
        int B = b.nextInt();

        int i;
        for (i = A; i<=B; ++i)
            System.out.println(+i);
        System.out.println(B-A+1);

    }
}
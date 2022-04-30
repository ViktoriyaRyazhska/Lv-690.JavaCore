package com.company;

import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число A:");
        int A = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Введите число B:");
        int B = b.nextInt();

        int i;
        int sum =0;
        for (i = A; i<=B; ++i)
            sum +=i;
            System.out.println(sum);


    }
}

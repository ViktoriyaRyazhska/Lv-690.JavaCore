package com.company;

import java.util.Scanner;

public class for17 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число A:");
        double A = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = a.nextInt();

        int i;
        int res =1;
        int sum = 1;
        for (i = 1; i <= N; ++i) {
            res *= A;
            sum += res;
        }
            System.out.println(sum);



    }
}

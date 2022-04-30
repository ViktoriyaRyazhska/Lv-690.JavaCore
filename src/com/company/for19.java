package com.company;

import java.util.Scanner;

public class for19 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = a.nextInt();

        int i;
        float res = 1;
        for (i = 1; i <= N; ++i) {
            res *= i;

        }
        System.out.println(res);

    }
}

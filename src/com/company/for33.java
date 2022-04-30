package com.company;

import java.util.Scanner;

public class for33 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = a.nextInt();
        int F1 = 1;
        int F2 = 1;
        System.out.println(F1);
        System.out.println(F2);

        int i;
        int res =1;
        for (i = 3; i <= N; ++i) {
           res = F1 + F2;
           F1 = F2;
           F2 = res;
            System.out.println(res);

        }


    }
}

package com.company;

import java.util.Scanner;

public class for38 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите положительное число N:");
        int N = a.nextInt();

        int i, i2;
        float res =0;
        for (i = 1; i <= N; i++) {
            int nn = i;
            for (i2 = 2; i2<=N-i+1; ++i2) {
                nn=nn*i;
            }
            res = res + nn;
        }


        System.out.println(res);



    }
}

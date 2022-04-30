package com.company;

import java.util.Scanner;

public class for36 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Введите число K:");
        int K = b.nextInt();

        int i, i2;
        float res =0;
        float nk;
        for (i = 1; i <= N; ++i) {
            nk = i;
            for (i2 = 1; i2<=K; ++K);
            nk *= i;
            res += nk;

            }


        System.out.println(res);



    }
}

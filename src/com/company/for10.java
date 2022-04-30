package com.company;

import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = a.nextInt();

        float i;
        float sum =0;
        for (i = 1; i<=N; ++i)
            sum +=1/i;
        System.out.println(sum);


    }
}

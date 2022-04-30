package com.company;

import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = a.nextInt();

        double i;
        double sum =0;
        for (i = 1; i<=N; ++i)
            sum +=Math.pow(-1,i+1)*(1+i/10);
        System.out.println(sum);


    }
}

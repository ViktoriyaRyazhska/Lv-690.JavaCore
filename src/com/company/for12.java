package com.company;

import java.util.Scanner;

public class for12 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = a.nextInt();

        float i;
        float comp =1;
        for (i = 1; i<=N; ++i)
            comp *=1+i/10;
        System.out.println(comp);


    }
}

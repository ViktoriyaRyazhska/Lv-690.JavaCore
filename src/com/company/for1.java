package com.company;

import java.util.Scanner;

public class for1 {
    public static void main (String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Введите число K:");
        int K = k.nextInt();
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = n.nextInt();

        int i;
        for (i=0; i<N; ++i)
                System.out.println(+K);

}

}

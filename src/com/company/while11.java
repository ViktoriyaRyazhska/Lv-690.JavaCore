package com.company;

import java.util.Scanner;

public class while11 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите положительное число N:");
        int N = n.nextInt();

        int K =0;
        int S =0;
        while (S<=N) {
            ++K;
        S +=K;}
        System.out.println("K:" +K);
        System.out.println("K:" +S);
    }
}

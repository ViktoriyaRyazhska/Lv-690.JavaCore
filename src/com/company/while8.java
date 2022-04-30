package com.company;

import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите положительное число N:");
        int N = n.nextInt();

        int K =0;
        while (N>=K*K) {++K;}
        System.out.println("Наименьшее целое число К, меньшее N, квадрат которого не превосходит N:" +(K-1));
    }
}

package com.company;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите положительное число N:");
        int N = n.nextInt();
        Scanner k = new Scanner(System.in);
        System.out.print("Введите положительное число K:");
        int K = k.nextInt();

        int modulo =N;
        int divis =0;
        do {
            modulo -= K;
            ++divis;
        }
        while (modulo>=K);
        System.out.println("Частное от деления N на К:" +divis);
        System.out.println("Остаток от деления N на К:" +modulo);
    }
}

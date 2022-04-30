package com.company;

import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите положительное число N:");
        int N = n.nextInt();

        int modulo =N;
        int divis =0;
        do {
            modulo -= 3;
            ++divis;
        }
        while (modulo>=3);
        if (modulo ==0) {System.out.println(true);}
        else {System.out.println(false);}
    }
}

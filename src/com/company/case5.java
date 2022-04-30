package com.company;

import java.util.Scanner;

public class case5 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число А:");
        int A = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Введите число B:");
        int B = b.nextInt();
        Scanner n = new Scanner(System.in);
        System.out.print("Введите номер действия N:");
        int N = n.nextInt();
        float C;

        switch(N) {
            case 1: C = (A+B); System.out.println("A+B=" +C);
                break;
            case 2:
                C = (A-B); System.out.println("A-B=" +C);
                break;
            case 3:
                C = A*B; System.out.println("A*B=" +C);
                break;
            case 4:
                C = (A/B); System.out.println("A/B=" +C);
                break;
            default:
                System.out.println("Error");
        }
    }
}

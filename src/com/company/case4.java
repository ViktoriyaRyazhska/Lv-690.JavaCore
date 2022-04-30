package com.company;

import java.util.Scanner;

public class case4 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите номер месяца:");
        int M = a.nextInt();

        switch(M) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4, 6, 9, 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Error");
        }
    }
}

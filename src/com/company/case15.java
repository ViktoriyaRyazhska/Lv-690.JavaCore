package com.company;

import java.util.Scanner;

public class case15 {
    public static void main (String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите достоинство карты N:");
        int N = n.nextInt();
        Scanner m = new Scanner(System.in);
        System.out.print("Введите масть карты М:");
        int M = m.nextInt();

        switch(N) {
            case 6:
                System.out.println("шестерка");
                break;
            case 7:
                System.out.println("семерка");
                break;
            case 8:
                System.out.println("восьмерка");
                break;
            case 9:
                System.out.println("девятка");
                break;
            case 10:
                System.out.println("десятка");
                break;
            case 11:
                System.out.println("валет");
                break;
            case 12:
                System.out.println("дама");
                break;
            case 13:
                System.out.println("король");
                break;
            case 14:
                System.out.println("туз");
                break;
            default:
                System.out.println("Error");
        }
        switch(M) {
            case 1:
                System.out.println("пик");
                break;
            case 2:
                System.out.println("треф");
                break;
            case 3:
                System.out.println("бубен");
                break;
            case 4:
                System.out.println("червей");
                break;
            default:
                System.out.println("Error");
    }
}
}

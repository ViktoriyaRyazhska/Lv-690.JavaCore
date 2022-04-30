package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);
        System.out.println("Введите два числа:");
        System.out.print("A:");
        int a = x1.nextInt();
        Scanner x2 = new Scanner(System.in);
        System.out.print("B:");
        int b = x2.nextInt();

        if (a > b) {
            int a1 = a - b;
            a = a - a1;
            b = b + a1;
        }
                System.out.println(a + ";" + b);



        }
    }



















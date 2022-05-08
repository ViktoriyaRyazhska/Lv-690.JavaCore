package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firs number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Enter third number");
        c = sc.nextInt();

        if (a % 2 == 0) {
            k++;
        }

        if (b % 2 == 0) {
            k++;
        }

        if (c % 2 == 0) {
            k++;
        }

        System.out.println("are odd: " + k);
    }
            }




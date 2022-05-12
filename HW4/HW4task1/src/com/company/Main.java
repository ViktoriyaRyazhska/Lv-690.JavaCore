package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number of the month: ");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();

        Month month = new Month();
        System.out.println(month.printNumberOfMonth(j));
   }

    }


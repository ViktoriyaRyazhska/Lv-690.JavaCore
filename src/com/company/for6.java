package com.company;

import java.util.Scanner;

public class for6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите цену 1 кг конфет:");
        double A = a.nextInt();

        double i;
        for (i = 1.2; i <= 2; i += 0.2)
            System.out.println(i * A);
    }
}

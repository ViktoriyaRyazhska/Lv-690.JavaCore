package com.company;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите положительное число A:");
        int A = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Введите положительное число B:");
        int B = b.nextInt();

        int temp=A;
        do {
            temp -= B;
                 }
            while (temp >=B);
            System.out.println(temp);
            }



        }









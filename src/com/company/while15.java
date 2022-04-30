package com.company;

import java.util.Scanner;

public class while15 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Введите ежемесячную процентную ставку:");
        float P = p.nextInt();

        float S =1000;
        int K =0;
        while (S<=1100) {
            ++K;
             S +=(S*P)/100;}
        System.out.println("K:" +K);
        System.out.println("K:" +S);
    }
}

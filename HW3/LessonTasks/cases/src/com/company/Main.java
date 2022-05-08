package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the day: ");
        int x = sc.nextInt();

        switch(x) {
            case 1 :
                System.out.println("EN: Mondey , UA: Понеділок" );
                break;
            case 2 :
                System.out.println("EN: Tuesday , UA: Вівторок" );
                break;
            case 3 :
                System.out.println("EN: Wednesday , UA: середа" );
                break;
            case 4 :
                System.out.println("EN: Thursday , UA: Четвер" );
                break;
            case 5 :
                System.out.println("EN: Friday , UA: П'ятниця" );
                break;
            case 6 :
                System.out.println("EN: Saturday , UA: Субота" );
                break;
            case 7 :
                System.out.println("EN: Sunday , UA: Неділя" );
                break;
            default :
                System.out.println("Wrong!");
        }
    }
}

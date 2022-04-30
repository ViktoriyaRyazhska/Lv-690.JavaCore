package com.company;

import java.util.Scanner;

public class case2 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите целое число К:");
        int K = a.nextInt();

        switch(K) {
            case 1:
                System.out.println("Плохо");
break;
            case 2:
                System.out.println("Неудовлетворительно");
break;
            case 3:
                System.out.println("Удовлетворительно");
break;
            case 4:
                System.out.println("Хорошо");
break;
            case 5:
                System.out.println("Отлично");
         break;
            default:
                System.out.println("Error");
        }
    }
}

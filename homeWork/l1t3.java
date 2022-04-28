package Homework.lesson1;

import java.util.Scanner;

public class l1t3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print price per minute of first call.");
        double c1 = sc.nextDouble();
        System.out.println("How long was that call?");
        int t1 = sc.nextInt();
        System.out.println("Total price is " + (c1 * t1));
        System.out.println("Print price per minute of second call.");
        double c2 = sc.nextDouble();
        System.out.println("How long was that call?");
        int t2 = sc.nextInt();
        System.out.println("Total price is " + (c2 * t1));
        System.out.println("Print price per minute of third call.");
        double c3 = sc.nextDouble();
        System.out.println("How long was that call?");
        int t3 = sc.nextInt();
        System.out.println("Total price is " + (c3 * t3));
        System.out.println("Total price of all calls is " + ((c1 * t1) + (c2 * t2) + (c3 * t3)));

    }
}

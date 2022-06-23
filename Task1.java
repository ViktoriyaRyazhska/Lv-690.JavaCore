package HW1;

import java.util.Scanner;

public class Task1 {

    static int n1=0, n2=1, n3=0;
    static void generateFibonacci(int n) {
        if (n>0) {
            n3=n1+n2;
            n1=n2;
            n2=n3;

            System.out.println("" +n3);
            generateFibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number:");
        int n = sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        generateFibonacci(n-2);}



}

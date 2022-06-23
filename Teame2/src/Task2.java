package HW1;

import java.util.Scanner;

public class Task2 {

    static void decomposeNumber(int n) {
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
               System.out.println(i);
                n = n / i;
                if (n > 2) {
                  System.out.println(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number:");
        int n = sc.nextInt();
        decomposeNumber(n);
    }
}





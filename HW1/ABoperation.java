package HW1;

import java.util.Scanner;

public class ABoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("a+b ="+sum);
        int min = a - b;
        System.out.println("a-b ="+min);
        int prod = a * b;
        System.out.println("a*b ="+prod);
        int div = a / b;
        System.out.println("a/b ="+div);
        System.out.println("The end.");
    }
}

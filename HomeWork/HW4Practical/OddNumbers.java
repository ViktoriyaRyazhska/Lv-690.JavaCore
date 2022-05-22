//Enter three numbers. Find out how many of them are odd.

package HW4Practical;

import java.util.Scanner;

public class OddNumbers {
    public static int count;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three numbers: a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        ;
        int c = sc.nextInt();
        amountOddNumber(a);
        amountOddNumber(b);
        amountOddNumber(c);
    }

    public static void amountOddNumber(int s) {
        if (s % 2 != 1) {
            count++;
                    }
        System.out.println("Odd number - " + s + "." + "  Amount of odd numbers - " + count);
    }

}
package lesson3;

import java.util.Scanner;

public class Praktika2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if (a < c && a < b) {
            System.out.println(a + "=" + "min");
        }

        if (c < a && c < b) {
            System.out.println(c + "=" + "min");
        }
        if (b < a && b < c) {
            System.out.println(b + "=" + "min");
        }
        if (a > c && a > b) {
            System.out.println(a + "=" + "max");
        }

        if (b > a && b > c) {
            System.out.println(b + "=" + "max");
        }
        if (c > a && c > b) {
            System.out.println(c + "=" + "max");
        }
    }
}

package Homework.lesson5;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(months[i-1]);
    }
}

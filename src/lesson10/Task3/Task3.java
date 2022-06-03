package lesson10.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the text from the console that contains several occurrences of US currency:");
        double number = console.nextDouble();
        System.out.printf("$=%.2f", number);
    }
}

package HW4;

import java.util.Scanner;

public class MonthDay {
//    Ask user to enter the number of month. Read the value and write the amount of days in this month
//    (create array with amount days of each month).

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of month:");
        int n = console.nextInt();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("In " + n + " month is " + days[n - 1] + "days.");
    }
}

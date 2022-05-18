/*Ask user to enter the number of month.
 Read the value and write the number of days in this month (create array with amount days of each month)*/
package Lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] monthDays = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number of month: ");
        int numberOfMonth = console.nextInt();
        if (numberOfMonth <1 || numberOfMonth >12){
            System.out.println("The number of month is wrong");
        }
        else {
            System.out.println("The number of days in this month " + monthDays[numberOfMonth - 1]);
        }
    }
}

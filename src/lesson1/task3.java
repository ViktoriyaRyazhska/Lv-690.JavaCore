package lesson1;

import java.util.Scanner;

/* Phone calls from three different countries are с1, с2 and с3 standard units per minute. Talks continued t1, t2 and t3 minutes.
How much computer will count for each call separately and all talk together?
Input all source data from console, make calculations and output to the screen.*/

public class task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the cost of 1 minute of conversation in the 1st country с1:");
        double c1= console.nextDouble();
        System.out.println("Enter the cost of 1 minute of conversation in the 2nd country с2:");
        double c2= console.nextDouble();
        System.out.println("Enter the cost of 1 minute of conversation in the 3rd country с3:");
        double c3= console.nextDouble();
        System.out.println("Enter the talk time in the 1st country t1:");
        double t1= console.nextDouble();
        System.out.println("Enter the talk time in the 2nd country t2:");
        double t2= console.nextDouble();
        System.out.println("Enter the talk time in the 3rd country t3:");
        double t3= console.nextDouble();
        double price1= c1*t1;
        double price2= c2*t2;
        double price3= c3*t3;
        System.out.println("Cost of a call in the 1st country: " + price1);
        System.out.println("Cost of a call in the 2nd country: " + price2);
        System.out.println("Cost of a call in the 3rd country: " + price3);
        double sum= price1+price2+price3;
        System.out.println("The total cost of calls in three countries: " + sum);
    }
}

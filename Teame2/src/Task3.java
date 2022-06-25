package HW1;

import java.io.IOException;
import java.util.Scanner;

public class Task3 {

    public static void execute() {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input cost of dollar:");
        double cost = sc.nextDouble();
        System.out.print("Input sum of money in gryvna:");
        double gryvna = sc.nextDouble();
        if (cost != 0) {
            sum = gryvna / cost;
            System.out.printf("%.2f", sum);
        }
    }

    //public static void main(String[] args) {
       // Task3.execute();
   // }
}

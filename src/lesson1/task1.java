package lesson1;

import java.util.Scanner;

//Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.

public class task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter radius of the flower bed:");
        double r= console.nextDouble();
        final double Pi = Math.PI;
        double L=2*r*Pi;
        double S=Pi*r*r;
        System.out.println("The perimeter of the flower bed is L = " + L + ".");
        System.out.println("The area of the flower bed is S = " + S + ".");
    }
}

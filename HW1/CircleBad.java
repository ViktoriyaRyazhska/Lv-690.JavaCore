package HW1;

import java.util.Scanner;

public class CircleBad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of flower bed:");
        int r = sc.nextInt();
        double pi = 3.14;

        double per = 2 * pi * r;
        System.out.println("Perimeter of flower bed is: " + per);
        double area = pi * r * r;
        System.out.println("Area of flower bed is: " + area);

    }
}

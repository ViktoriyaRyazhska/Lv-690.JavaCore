package HW11;

import java.util.Scanner;

public class CircleBadException {
    public static void main(String[] args) {
        double pi = 3.14;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius of flower bed:");
            int r = sc.nextInt();
            System.out.println("Perimetr: " +perimetr(r, pi));
            System.out.println("Area: " +area(r, pi));
        } catch (NumberFormatException | NegativeValueExteption e) {
            System.out.println(e.getMessage());
        }
    }
        public static double perimetr (int r, double pi) throws NegativeValueExteption {
            if (r <= 0) {
                throw new NegativeValueExteption("You enter invalid radius.");
            }
            return 2 * pi * r;
        }
        public static double area (int r, double pi) throws NegativeValueExteption {
        if (r<=0) {
            throw new NegativeValueExteption("You enter invalid radius.");}
        return pi*r*r;
            }
        }



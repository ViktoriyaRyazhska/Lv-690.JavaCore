//read 3 float numbers and check: are they all belong to the range [-5,5];

import java.util.Scanner;

public class FloatNumbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        float c = 0;
        System.out.println("Enter 3 float numbers");
        try {
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("You enter wrong number");
            return;
        }
        audit(a);
        audit(b);
        audit(c);
    }

    public static void audit(float s) {
        if (s >= -5 && s <= 5) {
            System.out.println("Належить масиву - " + s + ".");
        } else {
            System.out.println("Виходить за межі масиву - " + s + ".");
        }
    }
}


package HW11;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of sides:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(squareRectangle(a, b));
        } catch (NumberFormatException | NegativeValueExteption e) {
            System.out.println(e.getMessage());
            System.out.println("Enter wrong format");
        }
    }

    public static int squareRectangle(int a, int b) throws NegativeValueExteption {
        if (a <= 0 || b <= 0) {
            throw new NegativeValueExteption("You enter negative number or wrong number");
        }
        return a * b;
    }
}






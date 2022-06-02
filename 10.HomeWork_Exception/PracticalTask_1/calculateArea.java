//Create a method for calculating the area of a rectangle
//        int squareRectangle (int a, int b),
//        which should throw an exception if the user enters negative value.
//        Input values a and b from console. Check the squareRectangle method in the method main.
//        Check to input nonnumeric value.


package PracticalTask_1;

import java.util.Scanner;

public class calculateArea {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            System.out.println(squareRectangle(a, b));
        } catch (NumberFormatException | negativeNumbException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter wrong format");
        }


    }

    public static int squareRectangle(int a, int b) throws negativeNumbException {
        if (a <= 0 || b <= 0) {
            throw new negativeNumbException("You enter negative number or wrong number");
        }
        return a * b;
    }
}

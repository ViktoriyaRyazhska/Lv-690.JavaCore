package HW11;
//Create method div(), which calculates the dividing of two double numbers.
// In main method input 2 double numbers and call this method. Catch all exceptions.
import java.util.Scanner;

public class Diw {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println(div(a, b));
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter wrong format");
        }

    }
    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("You enter wrong number");
        }
        return a/b;
    }
}

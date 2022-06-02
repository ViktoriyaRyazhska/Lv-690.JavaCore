package HomeWork.Div;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Div {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;

        try {
            Double a = Double.parseDouble(bf.readLine());
            Double b = Double.parseDouble(bf.readLine());
            result = div(a, b);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println(result);

    }

    public static double div(double a, double b) throws ArithmeticException {

        if (a == 0 && b == 0) {
            throw new ArithmeticException("Not a number");
        } else if (a == 0 || b == 0) {
            throw new ArithmeticException("Division by zero results in infinity");
        }
        return a / b;
    }
}

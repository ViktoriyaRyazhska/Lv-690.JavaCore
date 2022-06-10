package homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception {
	
	public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double res = 0;

        try {
            Double a = Double.parseDouble(bf.readLine());
            Double b = Double.parseDouble(bf.readLine());
            res = div(a, b);
            
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println(res);

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

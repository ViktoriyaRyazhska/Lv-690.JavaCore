package lesson11.Task1;



public class Div {

    public double div(double number1, double number2) throws ArithmeticException {
        try {
            System.out.println("Result: " + (number1 / number2));
            return number1 / number2;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}




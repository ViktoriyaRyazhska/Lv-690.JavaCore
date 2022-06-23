package HW10_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrTask {

    public static void main(String[] args) {

        //1 squareRectangle
        int a = number("enter number a:");
        int b = number("enter number b:");
        try {
            int s = squareRectangle(a,b);
            System.out.println("result: "+s);
            } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int number(String txt) {

        String input = CheckEnter(txt);
        try {
            int a = Integer.parseInt(input);
            return a;
        } catch (NumberFormatException e){
            System.err.println("enter numeric value, please");
        }
        return 0;
    }

    public static String CheckEnter(String txt) {
        String input;
        try {
            input = enterInt(txt);
        } catch (IOException e) {
            System.err.println("enter something");
            input = "";
        }
        return input;
    }

    public static String enterInt(String txt) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(txt);

        return br.readLine();
    }

    public static int squareRectangle(int a, int b) throws ArithmeticException {

        if (a<0 || b<0)
            {
                throw new ArithmeticException("negative value");
            }
        int i = a * b;
        return i;
    }

}

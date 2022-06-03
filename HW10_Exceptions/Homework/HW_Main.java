package HW10_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class HW_Main {
    public static void main(String[] args) {

        //1 div by 0
        double a = number("enter number a:");
        double b = number("enter number b:");
        try {
            double s = div(a,b);
            System.out.println("result: "+s);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        //2 enter 10 numbers
        int start = (int) number("enter start of the range:");
        int end = (int) number("enter end of the range:");
        int i = 0;
        do {
            try{
                readNumber(start,end);
                i++;
            }catch (NoSuchElementException noSuchElementException){
                System.err.println(noSuchElementException.getMessage());
            }
        } while (i<10);
    }

    public static double number(String txt) {

        String input = CheckEnter(txt);
        double a = 0.0;
        try {
            a = Double.parseDouble(input);
            return a;
        } catch (NumberFormatException e){
            System.err.println("enter numeric value, please");
        }
        return a;
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

    public static double div(double a, double b) throws ArithmeticException {
        if (b==0)
        {
            throw new ArithmeticException("division by zero");
        }
        double i = a / b;
        return i;
    }

    public static int readNumber(int start, int end) throws NoSuchElementException {
        int inputNumber = (int) number("enter number from "+start+" to "+end);
        if (inputNumber<start || inputNumber> end) {
            throw new NoSuchElementException("number "+inputNumber+" isn't correct. Try again");
        }
        return inputNumber;
    }



}

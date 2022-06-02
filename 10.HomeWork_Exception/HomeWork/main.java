//Create method div(), which calculates the dividing of two double numbers.
//        In main method input 2 double numbers and call this method.
//        Catch all exceptions.
//        Write a method readNumber(int start, int end),
//        that read from console integer number and return it, if it is in the range [start...end].
//        If an invalid number or non-number text is read, the method should throw an exception.
//        Using this method write a method main(), that has to enter 10 numbers:
//        a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
//        Refactor your previous homework (1-7) and
//        try to handle all possible exceptions in your code


package HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double answer = 0;
        Scanner sc =new Scanner(System.in);
       try {
           double a = Double.parseDouble(sc.next());
           double b = Double.parseDouble(sc.next());
           if(b==0) {
               throw new ArithmeticException("/ by zero");
           }
           answer=div(a,b);
       }catch (NumberFormatException |InputMismatchException e){
           System.err.println(e.getMessage());
       }
       if(answer!=0) {
           System.out.println(answer);
       }
    }
    public static double div(double a,double b){
        return a/b;
    }
}

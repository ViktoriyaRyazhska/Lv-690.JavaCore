package HW11;

import com.sun.jdi.InvalidLineNumberException;

import java.util.Scanner;

public class ReadNumber {
    //Write a method readNumber(int start, int end), that read from console integer number and
    // return it, if it is in the range [start...end].
    //If an invalid number or non-number text is read, the method should throw an exception.
    //Using this method write a method main(), that has to enter 10 numbers:
    //	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                readNumber(50, 100);

            } catch (NumberFormatException | HW11.RangeException e) {
                System.out.println(e.getMessage());
                System.out.println("Enter wrong number.");
            }
        }
    }

    public static int readNumber(int start, int end) throws HW11.RangeException {
        System.out.println("Range is between: " + start + " " + end);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= start || num >= end) {
            throw new HW11.RangeException("Try again.");
        }
        return num;
    }
}


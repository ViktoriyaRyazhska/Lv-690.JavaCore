package ls11;

/*
 * Create method div(), which calculates the dividing of two double numbers. 
 * In main method input 2 double numbers and call this method. Catch all exceptions. 
 * 
 * Write a method readNumber(int start, int end), that read from console integer number 
 * and return it, if it is in the range [start...end]. 
 * If an invalid number or non-number text is read, the method should throw an exception. 
 * Using this method write a method main(), that has to enter 10 numbers:
 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			double a = Double.parseDouble(br.readLine());
			double b = Double.parseDouble(br.readLine());
			System.out.println(div(a, b));
		} catch (ArithmeticException | IOException | NumberFormatException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		int buf = 0;
		int count = 10;
		for (int i = 0; i < count; i++) {
			try {
				System.out.print("Enter the some number: ");
				int number = Integer.parseInt(br.readLine());				
				if (buf < number) {
					System.out.println(readNumber(5, 20, number));
					buf = number;
				} else {
					System.out.println("The number must be greater than the previous one");
					count++;
				}
				
			} catch (NumberOutOfRangeException | NumberFormatException | IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
		

	}

	public static double div(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

	public static int readNumber(int start, int end, int number) throws NumberOutOfRangeException {
		if (start > number || end < number) {
			throw new NumberOutOfRangeException("Number is out of range [" + start + ", " + end + "]");
		}
		return number;

	}

}

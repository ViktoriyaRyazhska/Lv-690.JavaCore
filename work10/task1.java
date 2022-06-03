package work10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("enter divided: ");
		double divided = Double.parseDouble(bf.readLine());
		System.out.print("enter divider: ");
		double divider = Double.parseDouble(bf.readLine());
		
		System.out.println("result: "+div(divided, divider));
		}catch(NullPointerException | NumberFormatException e) {
			System.err.println("incorrect data format");
		} catch (IOException e) {
			System.err.println("how did you call IOException?");
		} catch(ArithmeticException e) {
			System.err.println("devide by zero");
		}
	}
	
	public static double div(double d1, double d2) {
		if(d2 !=0) {
			return d1/d2;
		}else {
			throw new ArithmeticException("devide by zero");
		}
		
	}

}

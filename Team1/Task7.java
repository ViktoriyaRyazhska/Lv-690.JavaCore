package practice15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
	public static void execute() {
		int num;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter number n: ");
		try {
			num= Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			System.err.println("IOException error");
			return;
		} catch (NumberFormatException e) {
			System.err.println("wrong format");
			return;
		}
		
		System.out.print("result(n!): "+factorial(num));
	}
	
	public static int factorial(int n){    
		if (n == 0)    
			return 1;    
		else    
			return(n * factorial(n-1));    
	}    

}

package practice15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
	public static void execute() {
		int num;
		int steps;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter number: ");
		try {
			num= Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			System.err.println("IOException error");
			return;
		} catch (NumberFormatException e) {
			System.err.println("wrong format");
			return;
		}
		
		for(steps=0;num>1;steps++) {
			if(num % 2 == 0) {
				num=num/2;
			}else {
				num=num*3+1;
			}
		}
		
		if(num<1) {
			System.err.println("the number must be positive");
			return;
		}
		
		System.out.print("number of steps: "+steps);
	}
}

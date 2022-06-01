package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static int err =0;


	public static void main(String[] args) {
		double d1 = Read("input double 1: "); // interrupt if exception 
		if (err!=0) {return;};
		double d2 = Read("input double 2: "); // interrupt if exception
		if (err!=0) {return;};
		if (d2==0)  {
			System.out.println("div by 0"); // avoid exception by checking = 0
		}
		else {
			System.out.println(div(d1, d2));
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int i=0; // loop until 10 numbers in range (1-100) will be read (not interrupt)
		while (i<10) {
			try {
				numbers.add(readNumber(1, 100, i+1));
				i++;
			} 
			catch (Exception e) {
				System.err.println(e.getMessage()+". Repeat input: ");
			}
		}

	}
	
	public static double Read(String q) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(q);
		String s ="";
		try {
			s = reader.readLine();
		} catch (IOException e) {
			System.err.println(e.getClass()+" "+e.getMessage());
			err = 1;
			return 0;
		}
		try {return Double.parseDouble(s);}
		catch (Exception e) {
			err = 2;
			System.err.println(e.getClass()+" "+e.getMessage());
		}		
		return 0;
	}
	
	public static double div(double a, double b) {
		try {
			return a/b;
		} 
		catch (Exception e) {
			System.err.println(e.getClass()+" "+e.getMessage());
			err = 3;
		}
		return 0;
	}	
	
	public static int readNumber(int start, int end, int n) throws Exception {
		int num = (int) Read("input number "+n+" from "+start+" to "+end);
		if (num<start || num> end) {
			throw new Exception("number is out of range");}
		return num; 
		}

	


}

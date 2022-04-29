package work1;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		double c1;
		double c2;
		double c3;
		
		int t1;
		int t2;
		int t3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the tariff in 1 country: ");
		c1 = Double.parseDouble(sc.nextLine());
		System.out.print("enter the tariff in 2 country: ");
		c2 = Double.parseDouble(sc.nextLine());
		System.out.print("enter the tariff in 3 country: ");
		c3 = Double.parseDouble(sc.nextLine());
		
		System.out.print("enter the time of the 1 call in minutes: ");
		t1 = Integer.parseInt(sc.nextLine());
		System.out.print("enter the time of the 2 call in minutes: ");
		t2 = Integer.parseInt(sc.nextLine());
		System.out.print("enter the time of the 3 call in minutes: ");
		t3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("count of 1 calling: " + c1*t1);
		System.out.println("count of 2 calling: " + c2*t2);
		System.out.println("count of 3 calling: " + c3*t3);
		
		System.out.println("count of all talk together: " + (c1*t1+c2*t2+c3*t3));
	}

}

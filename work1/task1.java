package work1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter radius(m): ");
		radius = Double.parseDouble(sc.nextLine());
		
		System.out.print("your perimeter(m): ");
		System.out.printf("%.3f", 2*3.142*radius);
		System.out.print("\n");
		System.out.print("your area(m^2): ");
		System.out.printf("%.3f", 3.142*radius*radius);
	}

}

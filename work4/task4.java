package work4;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Car[] cars=new Car[4];
		 cars[0] = new Car("Ford" , 2020 , 1194);
	     cars[1] = new Car("Toyota" , 2013 , 1548);
	     cars[2] = new Car("Volkswagen" , 2002 , 1200);
	     cars[3] = new Car("Kia" , 2015 , 1678);
	     int year;
	     
	     Scanner sc = new Scanner(System.in);
		 System.out.print("enter model year: ");
		 year = Integer.parseInt(sc.nextLine());
	     Car.CarByYear(cars, year);
	     
	     Car.sortCars(cars);
	     for (int i = 0; i < cars.length; i++) {
	        	System.out.println(cars[i]);
	        }
	}

}

package ls5;

/*
 * 1.Ask user to enter the number of month. Read the value and write the amount of days in this month 
 *   (create array with amount days of each month).
 *   
 * 2.Enter 10 integer numbers. Calculate the sum of first 5 elements 
 *   if they are positive or product of last 5 element in the other case.
 *   
 * 3.Enter 5 integer numbers. Find 
 *  - position of second positive number;
 *  - minimum and its position in the array.
 *  Organize entering integers until the first negative number. 
 *  Count the product of all entered even numbers.
 *  
 * 4.Create class Car with fields type, year of production and engine capacity. 
 *   Create and initialize four instances of class Car. Display cars
 *  - certain model year  (enter year in the console);
 *  - ordered by the field year.
 *  
 * 5*.Add Unit Tests to each task, publish code on GitHub
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		ArrayList<Car> cars = new ArrayList<>();
//		
//		cars.add(new Car("Ferari", 2013, 3.6));
//		cars.add(new Car("Mazeratti", 2015, 5.2));
//		cars.add(new Car("Renault", 2018, 2.5));
//		cars.add(new Car("Ford", 2017, 1.6));
//		cars.add(new Car("Volvo", 2013, 4.4));
//		
//		Car.printCars(cars);
//		Car.printModelYear(cars, br);
//		System.out.println();
//		Car.sortCarByTheYear(cars);
//		Car.printCars(cars);
//		amountOfDaysMonth(br);
//		exercisesWithArray(br);
		integerArray(br);
//		notNegativArray(br);

	}
	
	public static void amountOfDaysMonth (BufferedReader br) throws NumberFormatException, IOException {
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] months = {"January", "February", "Marth", "April", "May", "June",
							"July", "August", "September", "October", "November", "December"};
		System.out.print("Enter number of month: ");
		int choice = Integer.parseInt(br.readLine());
		if (choice > 0 && choice < 13) {
			System.out.println("Amount of days in " + months[choice - 1] +  " is " + days[choice - 1]);
		} else {
			System.out.println("Incorrect input");			
		}
	}

	public static void exercisesWithArray (BufferedReader br) throws NumberFormatException, IOException {
		int[] numbers = new int[10];
		int countNegativeNumbers = 0;
		int resultSum = 0;
		int resultMult = 1;
		System.out.println("Enter the ten integers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if (numbers[i] > 0 && i < 5) {
				countNegativeNumbers++;
			}
		}
		if (countNegativeNumbers == 5) {
			for (int i = 0; i < 5; i++) {
				resultSum += numbers[i];
			}
			System.out.println("The result of sum= :" + resultSum);
		} else {
			for (int i = numbers.length - 1; i > numbers.length - 6; i--) {
				resultMult *= numbers[i];
			}
			System.out.println("The result of mult= :" + resultMult);
		}
		
	}
	
	public static void integerArray (BufferedReader br) throws NumberFormatException, IOException {
		int[] arr = new int[5];
		System.out.println("Enter the five integers");
			
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());		
		}
		System.out.println(Arrays.toString(arr));
		
		int positivCount = 0;		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positivCount++;
			}
			if (positivCount > 1) {
				System.out.println("Second positive number has posirion " + i);
				break;
				
			}
		}
		int min = arr[0];
		int imin = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				imin = i;
			}
		}
		System.out.println(" min= " + min + " \n position of minimum= " + imin);
	}

	public static void notNegativArray (BufferedReader br) throws NumberFormatException, IOException {
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.print("Enter the integer number: ");
		int number = Integer.parseInt(br.readLine());
		while (number > 0) {
			arrayList.add(number);
			System.out.print("Enter the integer number: ");
			number = Integer.parseInt(br.readLine());
		}
		System.out.println("Your array: " + arrayList.toString());
		int mult = 1;
		for (int i = 0; i < arrayList.size(); i++) {
			mult *= arrayList.get(i);
		}
		if (mult > 1) {
			System.out.println("The result of multiplying positive numbers= " + mult);
		} else {
			System.out.println("Arrays don't have positive numbers");
		}
		
	}
}


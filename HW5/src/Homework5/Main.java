package Homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int task = Integer.parseInt(Read("Task № (1,2,3,4,5,6,7): ", br));
	if (task == 1) {
		int[] numbers = {5, 6, 8, 3, 5, 7, 9, 2, -5, -8, 0};
		Calc calc = new Calc(numbers);
		calc.printBiggest();
		calc.printAmountNeg();
		calc.printSumPos();	
	}
	if (task == 2) {
		Employee[] list = {
				new Employee("Nick", 1, 1000),
				new Employee("John", 1, 1500),
				new Employee("Sam", 2, 1000),
				new Employee("Bob", 2, 2000),
				new Employee("Max", 3, 1400)
		};
		Employees emlpoyees = new Employees(list);
		emlpoyees.EmployeesOfDpt(1);
		emlpoyees.printSalary();
	}
	if (task == 3) {
		int num = Integer.parseInt(Read("Number of month: ", br));
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (num>=1 && num<=12) {
			System.out.println("days in month ="+days[num-1]);			
		}
		else {
			System.out.println("wrong month number");
		}
	}
	
	if (task == 4) {
		int[] numbers = {5, 6, 8, -5, 1, 2, 3, 4, 1, 1};
		Calc calc = new Calc(numbers);
		calc.printSP();

	}

	if (task == 5) {
		int[] numbers = {-5, 6, -8, 5, 1};
		Calc calc = new Calc(numbers);
		calc.printPositionOfSecondPositive();
		calc.printMinimumAndPosition();
	}
	
	if (task == 6) {
		int res = 1;
		int x = 0;
		do {
			x = Integer.parseInt(Read("enter number: ", br));
			if (x % 2 == 1 || x % 2 == -1) {
				res = res * x;
			};
		}while (x>=0);
			System.out.println("product of all entered even numbers = "+res);
		
	}
	
	if (task == 7) {
		Car[] list = {
				new Car("BMW", 2020, 3000),
				new Car("Mercedes", 1997, 5500),
				new Car("Volvo", 2012, 2500),
				new Car("Opel", 2012, 1600),
				new Car("Renault", 2001, 1400)
		};
		Cars cars = new Cars(list);
		cars.printModelsOfYear(2012);
		cars.printOrderedByYear();

	}
	
	}
	public static String Read(String q, BufferedReader br) {
		System.out.println(q);
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	

}

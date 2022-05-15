package ls5;

/*
 * 1.Create an array of ten integers. Display 
 *  - the biggest of these numbers;
 *  - the sum of positive numbers in the array;
 *  - the amount of negative numbers in the array.
 *     What values there are more: negative or positive?
 * 2.Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
 *  - all employees of a certain department (enter department number in the console);
 *  - arrange workers by the field salary in descending order.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = {3, 5, 21,-5, -10, -11, 15, -22, -4, 25};
			
		System.out.println("Max= " + maxElement(array));
		System.out.println("Sum positive numbers " + sumPositiveNumbers(array));
		System.out.println(positiveOrNegative(array));
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Vasia", 1, 700));
		employees.add(new Employee("Petro", 1, 350));
		employees.add(new Employee("Sergiy", 3, 400));
		employees.add(new Employee("Maryna", 3, 250));
		employees.add(new Employee("Anna", 2, 500));
		employees.add(new Employee("Yana", 2, 650));
		
		Employee.employeesOfdepartment(employees, br);
		
		System.out.println();		

		Employee.sortSalaryEmployee(employees);
		Employee.printArrayList(employees);
	}
	
	
	public static int maxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	public static int sumPositiveNumbers(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	
	public static int countAmountNegativeNumbers(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		return count;
	}
	
	
	public static int countAmountPositiveNumbers(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		return count;
	}
	
	 
	public static String positiveOrNegative (int[] arr) {
		if (countAmountPositiveNumbers(arr) > countAmountNegativeNumbers(arr)) {
			return "Positive numbers are more";
		} 
		return "Negative numbers are more";
	}
		
}

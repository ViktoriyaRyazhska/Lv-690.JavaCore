package hm6;

import java.util.Arrays;

public class Employee {
	
	
	public static void main(String[] args) {
		
		Employee[] employee = new Employee[2];
		employee[0] = new SalariedEmployee(000321,60,80);
		employee[1] = new ContrackEmployee(000123,1250);
		//Arrays.sort(employee);
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee);
		}
	}
	}

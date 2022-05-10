package Homework5;

import java.util.Arrays;

public class Employees {
	
	private Employee[] list;

	public Employees(Employee[] list) {
		this.list = list;
	}
	
	public void EmployeesOfDpt(int dptNumber) {
		System.out.println("Employees Of Dpt "+dptNumber+":");
		for (int i=0;i<list.length;i++) {
			if (list[i].getDptNumber() == dptNumber) {
				System.out.println(list[i]);
			}
		
		}
	}
	
	public void printSalary() {
		Arrays.sort(list);
		System.out.println("Salary:");
		for (int i=0;i<list.length;i++) {
				System.out.println(list[i]);
			}
		
	}

	
	
	
	
}

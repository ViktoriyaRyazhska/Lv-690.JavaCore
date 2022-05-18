package Homework7;

import java.util.Comparator;



public class Employee implements Comparable<Employee>{
	private int employeeld;
	

	public Employee(int employeeld) {
		this.employeeld = employeeld;
	}
	
	public int getEmployeeId() {
		return employeeld;
	}

	
	public int calculatePay() {
		return 0;
	}
	
	public String getInfo() {
		return "";
	}
	

	@Override
	public int compareTo(Employee o) {
		return this.calculatePay() - o.calculatePay();
	}

}

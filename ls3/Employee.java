/*
 * Create Console Application project in Java.
 * Add class Employee to the project.
 * Class Employee should consist of
 *    three private fields: name, rate and hours; 
 *	 static field totalSum
 *	 properties for access to these fields;
 *	 default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
 *	 methods:
 * getSalary() - to calculate the salary of person (rate * hours)
 * toString() - to output information about employee
 * changeRate(int rate) - to change the rate of some employee and recalculate his salary
 * getBonuses() – to calculate 10% from salary
 * In the method main() create 3 objects of Employee type. Input information about them. 
 * Display the total salary of all workers to screen
 */

package ls3;

public class Employee {		
	static int totalSum ;	
	private String name;
	private int rate;
	private int hours;
	
		
	public Employee() {
		totalSum += rate * hours;
	}
	
	public Employee(String name, int rate, int hours) {
		
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += rate * hours;
	}
	
	public Employee(String name, int rate) {
		
		totalSum += rate * hours;
		this.name = name;
		this.rate = rate;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRate() {
		return rate;
	}
	
	public void setRate(int rate) {
		totalSum -= this.rate * hours;
		this.rate = rate;
		totalSum += rate * hours;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		totalSum -= rate * this.hours;
		this.hours = hours;
		totalSum += rate * hours;
		
	}
	
	public int getSalary() {
		return hours * rate;
	}	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public void changeRate(int rate) {		
		setRate(rate);
		
	}
	
	public double getBonuses() {
		return getSalary() * 0.1;
	}
	

}

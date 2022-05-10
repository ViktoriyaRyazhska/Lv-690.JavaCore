package Homework5;

public class Employee implements Comparable<Employee> {
	private String name;
	private int dptNumber;
	private int salary;
	public Employee(String name, int dptNumber, int salary) {
		this.name = name;
		this.dptNumber = dptNumber;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dptNumber=" + dptNumber + ", salary=" + salary + "]";
	}
	@Override
    public int compareTo(Employee employee) {
        return (employee.salary - this.salary);
    }
	 
	
	public int getDptNumber() {
		return dptNumber;
	}
	public int getSalary() {
		return dptNumber;
	}
	
}

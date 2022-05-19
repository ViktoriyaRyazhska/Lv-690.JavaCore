package ls6.Homework6;

public class Employee {
	protected String name;
	protected int age;
	protected double salary;
	
	public Employee(String name, int age, double salary) {		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String report() {
		return String.format("Name: %s, Age: %d, Salary: %.2f.", name, age, salary);
	}
}

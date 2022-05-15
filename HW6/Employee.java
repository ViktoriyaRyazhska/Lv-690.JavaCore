package Homework6;

public class Employee{
	private String name;
	private int age;
	private int salary;
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String report() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public String toString() {
		return report();
	}
	
	public void Print() {
		System.out.println(toString());
	}
	
	
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	
}

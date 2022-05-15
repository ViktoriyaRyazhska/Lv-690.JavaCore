package Homework6;

public class Developer extends Employee {

	public Developer(String name, int age, int salary) {
		super(name, age, salary);
	}
	public String report() {
		return "Developer "+super.report();
	}

}

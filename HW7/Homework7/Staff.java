package Homework7;

public abstract class Staff extends Person {
	private int salary;
	public abstract int salary();
	public abstract void print(); 

	public Staff(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	

}

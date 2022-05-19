package ls7.Person;

public abstract class Staff extends Person{
	private double salary;
	
	public Staff (String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void print() {
		System.out.print("I am a ");		
	}
	
	public abstract void salary();
	

}

package ls7.Person;

public class Cleaner extends Staff{
	private String TYPE_PERSONE = "Cleaner";
	

	public Cleaner(String name, double salary) {
		super(name,salary);
		
	}

	@Override
	public void salary() {
		System.out.println("Name: " + getName() + ", " + TYPE_PERSONE + ", The Salary= " + getSalary());
	}

	@Override
	public void print() {
		super.print();
		System.out.println(TYPE_PERSONE);
	}

}

package ls7.Person;

public class Teacher extends Staff{
	private String TYPE_PERSONE = "Teacher";
		
	public Teacher(String name, double salary) {
		super(name, salary);		
	}

	@Override
	public void salary() {		
		System.out.println("Name: " + getName() + ", " + TYPE_PERSONE + ", The salary= " + getSalary());
	}

	@Override
	public void print() {
		super.print();
		System.out.println(TYPE_PERSONE);
	}


}

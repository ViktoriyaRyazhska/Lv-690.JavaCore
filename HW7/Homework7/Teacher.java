package Homework7;

public class Teacher extends Staff {
	final String TYPE_PERSON="Teacher";

	public Teacher(String name, int salary) {
		super(name, salary);
	}

	@Override
	public void print() {
		System.out.println("I am "+TYPE_PERSON+" "+getName()+", salary="+salary());
	}

	@Override
	public int salary() {
		return getSalary();
	}


}

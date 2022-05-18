package Homework7;

public class Student extends Person {
	final String TYPE_PERSON="Student";

	public Student(String name) {
		super(name);
	}

	@Override
	public void print() {
		System.out.println("I am "+TYPE_PERSON+" "+getName());

	}

}

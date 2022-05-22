package Homework82;

public class Student extends Person {
	private int course;

	public Student(String firstName, String lastName, int age, int course) {
		super(firstName, lastName, age);
		this.course = course;
	}

	@Override
	public String info() {
		return super.info()+", course="+course;
	}

	@Override
	public String activity() {
		return "I study at university";
	}

	public void printInfo() {
		super.printInfo();
	}

}

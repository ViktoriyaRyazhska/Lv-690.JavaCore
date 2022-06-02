package HW8.task1;


public class StudentHW8 extends Person {
	private int course;

	public StudentHW8(String firstName, String lastName, int age, int course) {
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
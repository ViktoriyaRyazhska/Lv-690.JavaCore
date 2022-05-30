package ls8.Homework_Task_1;

public class Student extends Person{
	private int course;
	
	public Student(FullName fullName, int age, int course) {
		super(fullName, age);
		this.course = course;
	}

	@Override
	public String info() {		
		return super.info() 
				+ ", Number of course: " + course;
		
	}

	@Override
	public String activity() {		
		return "I study at university. My number of course is - " + course;
	}

	
}

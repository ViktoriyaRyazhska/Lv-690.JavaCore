package homework7;

public class Student extends Person{
	private int course;
	
	public Student(String firstN, String lastN, int age, int course) {
		super(firstN, lastN, age);
		this.course = course;
	}

	@Override
	public String activity() {
		
		return "I study at university";
	}

	@Override
	public String info() {
		return "First name- " + getFirstn() + " last name- " + getLastn() + " age: "+getAge() ;   
	}
	
	
	
}

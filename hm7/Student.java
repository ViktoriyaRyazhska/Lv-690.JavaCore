package hm7;

public class Student extends Person {
	private int course;
	public Student(String firstN, String lastN, int age, int course) {
		super(firstN, lastN, age);
		this.course = course;
	}
	public int getCourse() {
        return course;
    }

	@Override
	public String activity() {
		return "I'm study" ;
	}
	@Override
	public String info() {
		return "First name: " + getFirstNam() +
                " Last name: " + getLastNam() +
                " Age: " + getAge() +
                " Course: " + getCourse();
		
		
	}
}

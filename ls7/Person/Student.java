package ls7.Person;

public class Student extends Person{
	private final String TYPE_PERSONE = "Student";
			
	public Student(String name) {
		super(name);		
	}	

	public String getTYPE_PERSONE() {
		return TYPE_PERSONE;
	}

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSONE);		
	}

}

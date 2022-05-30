package ls8.Homework_Task_1;

public abstract class Person {
	private FullName fullName = new FullName(null, null);
	private int age;
	
	public Person(FullName fullName, int age) {		
		this.fullName = fullName;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String info() {
		return "First name: " + fullName.getFirstName()
				+ ", Last name: " + fullName.getSecondName() 
				+ ", Age: " + age;
	}
	
	public abstract String activity();
}

package Homework82;

public abstract class Person {
	private FullName fullName;
	private int age;
	public Person(String firstName, String lastName, int age) {
		this.fullName = new FullName(firstName, lastName);
		this.age = age;
	}

	public String info() {
		return fullName.getFullName()+", age=" + age;
	}
	
	public abstract String activity();
	
	public void printInfo() {
		System.out.println(info()+" "+activity());
	}
}

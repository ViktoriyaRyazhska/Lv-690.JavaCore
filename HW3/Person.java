package Homework3;
import java.time.Year;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	public Person() {
		this.firstName = "unknown";
		this.lastName = "unknown";
		this.birthYear = 2000;
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = 2000;
	}
	public int getAge() {
		Year year = Year.now();
		return year.getValue()-birthYear;
	}

	public void setAge(int birthYear) {
		this.birthYear = birthYear;
	}
	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;		
	}
	@Override
	public String toString() {
		return firstName + " " + lastName + ", birthYear=" + birthYear + ", age=" + getAge()+"]";
	}
	
}

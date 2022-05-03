/*
 * Create Console Application project in Java.
 * Add class Person to the project.
 * Class Person should consist of
 * three private fields: firstName, lastName and birthYear (the birthday year) 
 * properties for access to these fields
 * default constructor and constructor with 2 parameters (first and last names)
 * methods:
 * getAge() - to calculate the age of person
 * input() - to input information about person
 * output() - to output information about person
 *changeName(String fn, String ln) - to change the first name or/and last name of person
 *
 * In the method main() create 5 objects of Person type and input information about them.
 */

package ls3;
import java.io.*;
import java.time.YearMonth; 

public class Person {
	private String firsName;
	private String lastName;
	private int birthYear;
	
	public Person(String firsName, String lastName) {
		this.firsName = firsName;
		this.lastName = lastName;
	}
	
	public Person() {
		
	}
		
	public String getFirsName() {
		return firsName;
	}
	
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
		
	public int getAge() {		
		return YearMonth.now().getYear() - birthYear;
	}
	
	public String output() {
		return "Person [firstName= " + firsName + "; lastName= " + lastName + "; birthYear= " + birthYear +"]";
	}
	
	public void input() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("This metod to input or change information about person");
		
		System.out.print("Enter first name of person: ");
		setFirsName(bf.readLine());
		
		System.out.print("Enter last name of person: ");
		setLastName(bf.readLine());
		
		System.out.print("Enter persons birth year: ");
		int brYear = Integer.parseInt(bf.readLine());
		setBirthYear(brYear);
		return;
	}
	
	public void changeName(String fn, String ln) {
		setFirsName(fn);
		setLastName(ln);
	}
}

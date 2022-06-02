package Person;

import java.io.*;
import java.time.YearMonth;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Person() {

	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
		return "Person [firstName= " + firstName + "; lastName= " + lastName + "; birthYear= " + birthYear + "]";
	}

	public void input() throws IOException {
		System.out.println("Information about person");

		System.out.print("Enter first name of person: ");
		setFirstName(br.readLine());

		System.out.print("Enter last name of person: ");
		setLastName(br.readLine());

		System.out.print("Enter persons birth year: ");
		int brYear = Integer.parseInt(br.readLine());
		setBirthYear(brYear);
		return;
	}

	public void changeName(String fn, String ln) {
		setFirstName(fn);
		setLastName(ln);
	}
}
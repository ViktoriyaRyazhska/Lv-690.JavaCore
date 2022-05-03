package work2;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	
	public Person() {}
	public Person(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	
	void setfName(String fName) {
		firstName = fName;
	}
	void setlName(String lName) {
		lastName = lName;
	}
	void setBirthYear(int bYear) {
		if(bYear>2022 || bYear<1900) {
			System.out.println("You`re a lier! it's not yours birthyear");
		}else {
			birthYear = bYear;
		}
	}
	
	
	String getfName() {
		return firstName;
	}
	String getlName() {
		return lastName;
	}
	int getBirthYear() {
		return birthYear;
	}
	
	
	int getAge() {
		return 2022-birthYear;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your first name: ");
		firstName = sc.nextLine();
		System.out.print("enter your last name: ");
		lastName = sc.nextLine();
		System.out.print("enter your birthyear: ");
		birthYear = Integer.parseInt(sc.nextLine());
		if(birthYear>2022 || birthYear<1900) {
			System.out.println("You`re a lier! it's not yours birthyear");
			birthYear = 0;
		}
	}
	void output() {
		System.out.println("Your first name is " + firstName);
		System.out.println("Your last name is " + lastName);
		System.out.println("Your birthyear is " + birthYear);
	}
	void changeName(String fn, String ln) {
		firstName = fn;
		lastName =ln;
	}
}

package HW2;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
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
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - birthYear;
    }

    public void input(Scanner console) {
        System.out.println("Enter firstName:");
        this.firstName = console.nextLine();
        System.out.println("Enter lastName:");
        this.lastName = console.nextLine();
        System.out.println("Enter birthYear:");
        this.birthYear = console.nextInt();
    }

    public void output() {
        System.out.println("firstName " + firstName);
        System.out.println("lastName " + lastName);
        System.out.println("birthYear " + birthYear);

    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}

package lesson2;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear = 2000;

    public static int count = 0;

    public Person () {count++;}

    public Person(String firstName , String lastName) {
        super();
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

    public int getAge(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year-birthYear;
    }
    public void input() {
         Scanner console = new Scanner(System.in);
            System.out.println("firstName:");
            this.firstName= console.nextLine();
            System.out.println("lastName:");
            this.lastName= console.nextLine();
            System.out.println("birthYear:");
            this.birthYear=console.nextInt();
        }

    public void output() {
        System.out.println("firstName "+firstName);
        System.out.println("lastName "+lastName);
        System.out.println("birthYear "+birthYear);

            }
    public void changeName(String fn, String ln) {
        this.firstName=fn;
        this.lastName=ln;
    }

}













package projectPerson;

import java.util.Calendar;
import java.util.Scanner;

public class Persons {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Persons(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Persons(){

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
        Calendar nowYear=Calendar.getInstance();
        return nowYear.get(Calendar.YEAR) -birthYear;
    }
    public String output(){
        return "Person: (firstName -"+firstName+" lastName -"+lastName+" birthYear -"+birthYear+").";
    }
public void input(){
       Scanner sc=new Scanner(System.in);
    System.out.println("Enter firsName: ");
    setFirstName(sc.nextLine());
    System.out.println("Enter lastName: ");
    setLastName(sc.nextLine());
    System.out.println("Enter birthYear: ");
    setBirthYear(sc.nextInt());
    return ;
}
public void changeName(String fn,String ln){
        setFirstName(fn);
        setLastName(ln);
}
}

package Person;

import java.time.LocalDate;

public class person {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private  int age;


    public person(){}

    public person(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        yearOfBirth = GetYear();
        age = GetAge();
    }
    public void SetYear(int year){

        this.yearOfBirth = year;
    }
    public int GetYear(){
        return yearOfBirth;
    }
    public int GetAge()
    {
        int presentYear = LocalDate.now().getYear();
        this.age = presentYear - this.yearOfBirth;
        return this.age;
    }
    public void nameChange(String fn,String ln)
    {
        this.firstName = fn;
        this.lastName = ln;
    }
    @Override
    public String toString()
    {
        return "Name:" + firstName +" " + lastName +"\nYear of birth:" + yearOfBirth + "\nAge:" + GetAge();
    }


}

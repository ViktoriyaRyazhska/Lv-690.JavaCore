import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear=getBirthYear();
        age=getAge();
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int pesentYear = LocalDate.now().getYear();
        this.age = pesentYear - this.birthYear;
        return this.age;
    }



    public void changeName(String fn, String ln) {
        fn = this.firstName;
        ln = this.lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + age +
                '}';
    }
}


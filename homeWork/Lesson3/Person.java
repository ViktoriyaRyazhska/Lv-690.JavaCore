package Homework.lesson3;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public Person() {
    }

    public void getAge(){
        System.out.print("Age is: ");
        System.out.println(2022 - this.birthYear);
    }

    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public void output() {
        System.out.print(this.firstName + " ");
        System.out.println(this.lastName);
        getAge();
    }
    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("Oleh", "Rogan");
        Person p3 = new Person();
        Person p4 = new Person("Iryna", "Bober");
        Person p5 = new Person();
        p1.changeName("Igor", "Goi");
        p1.birthYear = 2000;
        p3.input("Nadya", "Lat", 1999);
        p2.birthYear = 1998;
        p3.output();
        p4.birthYear = 2002;
        p5.input("Bob", "Marley", 1945);
        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();


    }
}

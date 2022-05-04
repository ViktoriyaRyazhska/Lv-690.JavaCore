//Create Console Application project in Java.
//        Add class Person to the project.
//        Class Person should consist of
//        three private fields: firstName, lastName and birthYear (the birthday year)
//        properties for access to these fields
//default constructor and constructor with 2 parameters (first and last names)
//        methods:
//        getAge() - to calculate the age of person
//        input() - to input information about person
//        output() - to output information about person
//        changeName(String fn, String ln) - to change the first name or/and last name of person
//
//        In the method main() create 5 objects of Person type and input information about them.


package projectPerson;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        System.out.println("Create p1: ");
        Persons p1=new Persons ("Roman","Frans");
        p1.setBirthYear(1993);
        System.out.println(p1.output()+" My age -"+p1.getAge());
        System.out.println();
        p1.setBirthYear(1985);
        System.out.println(p1.output()+" My age -"+p1.getAge());


        System.out.println("Create p2: ");
        Persons p2=new Persons ("Roman","Frans");
        p2.setBirthYear(1990);
        System.out.println(p2.output()+" My age -"+p2.getAge());
        p2.setBirthYear(1988);
        p2.changeName("Ira","Makogin");
        System.out.println(p2.output()+" My age -"+p2.getAge());




        System.out.println("Create p3: ");
        Persons p3=new Persons ("Roman","Frans");
        p3.setBirthYear(1980);
        System.out.println(p3.output()+" My age -"+p3.getAge());


        System.out.println("Create p4: ");
        Persons p4=new Persons ();
        p4.setFirstName("Nastia");
        p4.setLastName("Frolova");
        p4.setBirthYear(2000);
        System.out.println(p4.output()+" - "+p4.getAge());




        System.out.println("Create p5: ");
        Persons p5=new Persons ();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firstName: ");
        p5.setFirstName(sc.nextLine());
        System.out.println("Enter LastName: ");
        p5.setLastName(sc.nextLine());
        System.out.println("Enter birthYear: ");
        p5.setBirthYear(sc.nextInt());
        System.out.println(p5.output()+" - "+p5.getAge());

    }
}

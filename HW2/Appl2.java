package HW2;

import java.util.Scanner;

public class Appl2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Maria", "Rybalko");
        Person p3 = new Person();
        Person p4 = new Person("Olag", "Golovkov");
        Person p5 = new Person();
        p1.changeName("Roman", "Abramyan");
        p1.birthYear = 1980;
        p2.birthYear = 2000;
        p3.input("Bob", "Williams", 1990);
        p4.birthYear= 1988;
        p5.input("Olga","Kanurna", 1980);

        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();
    }
}

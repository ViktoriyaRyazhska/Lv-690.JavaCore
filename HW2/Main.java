package com.company;

import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Person p1 = new Person("Mark ","Star");
        Person p2 = new Person();
        Person p3 = new Person("Tom ", "Walker");
        Person p4 = new Person("Andriy ", "Yariv");
        Person p5 = new Person();


        p1.setBirthYear(1997);
        p1.output();

        p2.input();
        p2.output();

        p3.setFirstName("Oleh");
        p3.setLastName("Moor");
        p3.setBirthYear(1996);
        p3.output();

        p4.changeName("Ihor","Kaniv");
        p4.output();





    }
}

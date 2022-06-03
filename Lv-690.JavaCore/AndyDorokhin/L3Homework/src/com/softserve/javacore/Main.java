package com.softserve.javacore;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person jenn = new Person();
        jenn.setFirstName("Jennifer");
        jenn.setLastName("Connelly");
        jenn.setBirthYear(1970);
        System.out.println(jenn);

        Person tom = new Person("Tom", "Cruise");
        tom.setBirthYear(1962);
        System.out.println(tom);

        Person val = new Person("Val", "Kilmer");
        val.setBirthYear(1959);
        System.out.println(val);

        Person kelly = new Person("Kelly", "McGillis");
        kelly.setBirthYear(1957);
        System.out.println(kelly);

        try {
            Person andy = Person.input();
            System.out.println(andy);
            System.out.println(andy.getFirstName() + " is " + andy.getAge());
        }
        catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }



    }
}

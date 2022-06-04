package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {}

    public Person(String firstName, String lastName) {
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

    public void changeName(String fn, String ln) {

        System.out.println("Current name: " + getFirstName() + " " + getLastName());

        setFirstName(fn);
        setLastName(ln);
        System.out.println("New name: " + getFirstName() + " " + getLastName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void output() {
        System.out.println(this);
    }

    public static Person input() throws IOException {
        Person person = new Person();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first name: ");
        String firstName =  br.readLine();
        System.out.println("Please enter last name: ");
        String lastName =  br.readLine();
        System.out.println("Please enter birth year: ");
        int birthYear = Integer.parseInt(br.readLine());

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setBirthYear(birthYear);
        System.out.println("New person created: " + person);

        return person;

    }

    public int getAge() {
        return LocalDateTime.now().getYear() - birthYear;
    }


}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    private String FirstName;
    private String LastName;
    private int BirthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getBirthYear() {

        return BirthYear;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
         FirstName = br.readLine();
        //System.out.println("My name is " + FirstName);
        System.out.println("What is your last name?");
         LastName = br.readLine();
       // System.out.println("My last name is " + LastName);
        System.out.println("How is your birth year?");
         BirthYear = Integer.parseInt(br.readLine());



    }

    void output() {

        System.out.println("Information || " + "First Name: " + FirstName + " | Last Name: " + LastName + " | Birth Year: " + BirthYear);

    }
    public void changeName(String fn, String ln) {
        FirstName = fn;
        LastName = ln;

    }
}

package com.company;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    Scanner sc = new Scanner(System.in);

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

    public Person(String firstName, String lastName, int birthYear) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Person(){

        }

    public int getAge(){
      return
        birthYear = 2022 - birthYear;
    }

    public void output(){
        System.out.println(firstName +" "+ lastName +" "+ birthYear + " years old");
    }

    public void input(){
        System.out.println("Enter firstName: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter lastName: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter birthYear: ");
        this.birthYear = sc.nextInt();
    }

    public String changeName(String firstName, String lastName){
        return (this.firstName = firstName) + " " + (this.lastName = lastName);


    }
}

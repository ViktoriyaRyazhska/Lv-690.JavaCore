package com.company;

public abstract class Person {

    private class FullName {
        private String firstName;
        private String lastName;
    }

    private FullName fullName = new FullName();
    private int age;

    public Person(String firstName , String lastName , int age){
        fullName.firstName = firstName;
        fullName.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return fullName.firstName;
    }

    public String getLastName() {
        return fullName.lastName;
    }

    public int getAge() {
        return age;
    }

    public String info(){
        return "First name: " + fullName.firstName + ", last name: " + fullName.lastName + ", age: " + age;
    }

    public abstract String activity();
}

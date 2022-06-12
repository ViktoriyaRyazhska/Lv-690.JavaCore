package com.softserve.javacore;

public class Teacher extends Staff{
    static final String TYPE_PERSON = "Teacher";

    public Teacher() {}

    public Teacher(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("My name is " +  getName());
        System.out.println("I am a " +  TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("My salary is 1200 per month.");
    }
}

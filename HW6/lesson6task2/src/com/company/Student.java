package com.company;

public class Student extends Person{
    private final String TYPE_PERSON = "Student";

    public Student(String name ) {
        super(name);

    }

    @Override
    public void print() {
        System.out.println("Hello, my name is " + getName() + ", I am a " + TYPE_PERSON);
    }
}

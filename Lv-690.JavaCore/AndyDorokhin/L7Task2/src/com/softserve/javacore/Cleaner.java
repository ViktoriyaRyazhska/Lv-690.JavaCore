package com.softserve.javacore;

public class Cleaner extends Staff{
    static final String TYPE_PERSON = "Cleaner";

    public Cleaner() {}

    public Cleaner(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("My name is " +  getName());
        System.out.println("I am a " +  TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("My salary is 600 per month.");
    }
}

package com.company;

public class Cleaner extends Staff{
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name , int hours) {
        super(name ,hours);
    }

    @Override
    public double salary() {
        return
                getHours() * 54.5;
    }

    @Override
    public void print() {
        System.out.println("Hello, my name is " + getName() +", I am a " + TYPE_PERSON);
    }
}

package com.company;

public class Teacher extends Staff{
    private final String TYPE_PERSON = "Teacher";

    public Teacher(String name , int hours) {
        super(name , hours);
    }

    @Override
    public double salary() {
        return
                getHours() * 60.5;
    }

    @Override
    public void print() {
        System.out.println("Hello, my name is " + getName() + ", I am a " + TYPE_PERSON);
    }


}

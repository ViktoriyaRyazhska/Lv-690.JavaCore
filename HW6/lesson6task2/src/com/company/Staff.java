package com.company;

public abstract class Staff extends Person{
    private int hours;
    public Staff(String name , int hours) {
        super(name);
        this.hours = hours;
    }



    public abstract double salary();

    public int getHours() {
        return hours;
    }
}

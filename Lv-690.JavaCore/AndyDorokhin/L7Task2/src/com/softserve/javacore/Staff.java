package com.softserve.javacore;

public abstract class Staff extends Person{

    public Staff() {}

    public Staff(String name) {
        super(name);
    }

    abstract void salary();
}

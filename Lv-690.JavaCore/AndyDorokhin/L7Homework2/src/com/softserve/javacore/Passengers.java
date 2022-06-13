package com.softserve.javacore;

public abstract class Passengers implements Vehicle{
    private int passangers;

    public Passengers(int passangers) {
        this.passangers = passangers;
    }

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

}

package com.softserve.javacore;

public abstract class GroundVehicle extends Passengers implements Vehicle{

    public GroundVehicle(int passangers) {
        super(passangers);
    }

    public abstract void drive();
}

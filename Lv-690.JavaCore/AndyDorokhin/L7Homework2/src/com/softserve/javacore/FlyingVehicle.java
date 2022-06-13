package com.softserve.javacore;

public abstract class FlyingVehicle extends Passengers implements Vehicle{

    public FlyingVehicle(int passangers) {
        super(passangers);
    }

    public abstract void fly();

    public abstract void land();

}

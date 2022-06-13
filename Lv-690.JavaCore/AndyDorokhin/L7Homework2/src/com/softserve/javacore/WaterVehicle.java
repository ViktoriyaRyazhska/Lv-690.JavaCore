package com.softserve.javacore;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle(int passangers) {
        super(passangers);
    }

    public abstract void isSailing();

}

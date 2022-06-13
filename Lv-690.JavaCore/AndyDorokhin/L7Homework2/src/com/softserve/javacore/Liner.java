package com.softserve.javacore;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner(int passangers, int floors) {
        super(passangers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing in the ocean.");
    }

    @Override
    public void run() {
        isSailing();
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                ", passengers=" + getPassangers() +
                "}";
    }
}

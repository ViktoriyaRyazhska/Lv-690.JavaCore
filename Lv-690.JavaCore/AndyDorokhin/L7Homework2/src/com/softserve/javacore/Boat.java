package com.softserve.javacore;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(int passangers, int volume) {
        super(passangers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing in the river.");
    }

    @Override
    public void run() {
        isSailing();
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                ", passengers=" + getPassangers() +
                "}";
    }
}

package com.company;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {
        super.isSailing();
    }


    public void information(){
        System.out.println("LINER     number of passengers : " + getPassengers() + ", numbers of the floor: " + floors);
    }
}

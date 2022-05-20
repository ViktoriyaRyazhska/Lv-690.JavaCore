package com.company;

public class Boat extends WaterVehicle{

    private int volume;

    public Boat(int passengers , int volume){
        super (passengers);
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    void isSailing() {
        super.isSailing();
    }

    public void information(){
        System.out.println("BOAT     number of passengers : " + getPassengers() + ", volume of the : " + volume);
    }
}

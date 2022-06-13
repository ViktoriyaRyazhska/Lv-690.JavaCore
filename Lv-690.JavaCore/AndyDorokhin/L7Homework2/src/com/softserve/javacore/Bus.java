package com.softserve.javacore;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(int passangers, String route) {
        super(passangers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving.");

    }

    @Override
    public void run() {
        drive();
    }

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' +
                ", passengers=" + getPassangers() +
                "}";
    }
}

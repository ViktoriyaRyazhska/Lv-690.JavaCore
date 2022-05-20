package com.company;

public class Bus extends GroungVehicle{
    private String route;

    public Bus(int passengers , String route){
        super(passengers);
        this.route = route;
    }

    public String getRoute(){
        return route;
    }

    public void setRoute(String route){
        this.route = route;
    }

    @Override
    void drive() {
        super.drive();
    }

    public void information(){
        System.out.println("BUS     numbers of passengers : " + getPassengers() + ", route : " + route);
    }
}

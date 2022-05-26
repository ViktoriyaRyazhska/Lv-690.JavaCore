package Lesson7.Task2;

public class GroundVehicle extends Passengers implements Vehicle  {

    public void drive() {
        System.out.println("Ground vehicle must be driven");
    }

}

class Bus extends GroundVehicle {
    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
    }
}

class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        super.drive();
    }
}

class Car extends GroundVehicle {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
    }
}
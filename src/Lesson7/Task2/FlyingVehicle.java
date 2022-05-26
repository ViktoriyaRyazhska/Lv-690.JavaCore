package Lesson7.Task2;

public class FlyingVehicle extends Passengers {
    public void fly() {
        System.out.println("Flying vehicle is fly");
    }
    public void land() {
        System.out.println("Flying vehicle does not travel on land");
    }
}

class Plane extends FlyingVehicle {
    private int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }
}
class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }
}
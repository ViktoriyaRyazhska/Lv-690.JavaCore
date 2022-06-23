package HW6_OOP2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Let's start, Ukrainian Mriya! Our max distance: "+this.getMaxDistance()+". On board: "+getPassengers());
    }

    @Override
    public void land() {
        System.out.println("landing the plane");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}

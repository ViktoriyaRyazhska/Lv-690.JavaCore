package HomeWork2;

public class Plane extends FlyingVehicle {
    int MaxDistance;

    public Plane(int pasangers, int maxDistance) {
        super(pasangers);
        MaxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return MaxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        MaxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }

    public void land() {
        System.out.println("Can landing");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "MaxDistance=" + MaxDistance + "Amount of passangers -" + getPasangers() +
                '}';
    }
}

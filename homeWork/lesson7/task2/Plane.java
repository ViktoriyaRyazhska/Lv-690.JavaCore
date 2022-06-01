package Homework.lesson7.task2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Plane(int pasagers, int maxDistance) {
        super(pasagers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane taking off!");
    }

    @Override
    public void land() {
        System.out.println("Plane landing!");
    }

    @Override
    public String toString() {
        return "\n This is a plane " +
                " his maxDistance=" + maxDistance;
    }
}

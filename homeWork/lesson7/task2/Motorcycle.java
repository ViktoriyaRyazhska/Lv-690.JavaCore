package Homework.lesson7.task2;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Motorcycle(int pasagers, int maxSpeed) {
        super(pasagers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "\nThis is Motorcycle " +
                " his maxSpeed: " + maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle driving!");
    }
}

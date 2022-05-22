package HW7.task2;

public class Motorcycle extends GroundVehicle {
    private int MaxSpeed;

    public Motorcycle(int passangers, int maxSpeed) {
        super(passangers);
        MaxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public void drive() {
        System.out.println("Motorcycle is drive on the road");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "MaxSpeed=" + MaxSpeed + " amount of passangers - " + getPassangers() +
                '}';
    }
}
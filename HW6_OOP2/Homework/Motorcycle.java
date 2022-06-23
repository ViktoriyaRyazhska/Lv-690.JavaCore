package HW6_OOP2;

public class Motorcycle extends GroundVehicle implements Vehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Max speed: "+getMaxSpeed()+"! On the bike: "+getPassengers());
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

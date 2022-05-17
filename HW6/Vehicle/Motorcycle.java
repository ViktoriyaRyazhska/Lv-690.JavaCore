package HomeWork.Vehicle;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passenger, int maxSpeed) {
        super(passenger);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    @Override
    public void drive() {
        System.out.println("Motorcycle on road");
    }

    @Override
    public void getInfo() {
        System.out.println("Passenger amount : " + getPassenger() +
                " Motorcycle max speed : " + getMaxSpeed());


    }

}

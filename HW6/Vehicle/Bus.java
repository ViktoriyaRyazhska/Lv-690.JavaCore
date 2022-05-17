package HomeWork.Vehicle;

public class Bus extends GroundVehicle {
    private String rout;

    public Bus(int passenger, String rout) {
        super(passenger);
        this.rout = rout;
    }

    public String getRout() {
        return rout;
    }

    @Override
    public void drive() {
        System.out.println("Bus driven out");
    }

    @Override
    public void getInfo() {
        System.out.println("Passenger amount :" + getPassenger() +
                " Bus on " + getRout() + " route :");


    }


}

package HomeWork.Vehicle;

public class Liner extends WaterVehicle {

    private int floor;

    public Liner(int passenger, int floor) {
        super(passenger);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public void isSailing() {
        System.out.println("Liner on ocean");
    }

    @Override
    public void getInfo() {
        System.out.println("Passenger amount :" + getPassenger() +
                " Liner floors amount :" + getFloor());

    }
}

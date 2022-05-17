package HomeWork.Vehicle;

public class Boat extends WaterVehicle {

    private int volume;

    public Boat(int passenger, int volume) {
        super(passenger);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat on sea ");
    }

    @Override
    public void getInfo() {
        System.out.println("Passenger amount :" + getPassenger() +
                " Boat volume :" + getVolume());

    }
}

package HW6_OOP2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("It's  sailing on river. On shipboard: "+getPassengers());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}

package HW7.task2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passangers, int volume) {
        super(passangers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void isSailling() {
        System.out.println("Boat is sailling");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + getVolume() + " amount of passanger " + getPassangers() +
                '}';
    }
}
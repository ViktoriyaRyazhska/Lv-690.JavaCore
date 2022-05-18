package HomeWork2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int pasangers, int volume) {
        super(pasangers);
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
                "volume=" + getVolume() + " amount of passanger " + getPasangers() +
                '}';
    }
}

package Homework.lesson7.task2;

public class Boat extends WaterVehicle {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boat(int pasagers, int volume) {
        super(pasagers);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "\nThis is a boat" +
                " volume:" + volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing!");
    }
}

package Lesson7.Task2;

public class WaterVehicle extends Passengers {

    public void isSailing() {
        System.out.println("Water vehicle is sailing");
    }

}
class Liner extends WaterVehicle {
    private int floors;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        super.isSailing();
    }
}

 class Boat extends WaterVehicle implements Vehicle {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        super.isSailing();
    }
}

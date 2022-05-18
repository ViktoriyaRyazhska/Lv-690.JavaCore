package HomeWork2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int pasangers, int floors) {
        super(pasangers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void isSailling() {
        System.out.println("Liner is Sailling");
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + getFloors() + " amount of passangers " + getPasangers() +
                '}';
    }
}

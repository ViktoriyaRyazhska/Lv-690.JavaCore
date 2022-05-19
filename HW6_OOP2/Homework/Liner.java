package HW6_OOP2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("It doesn't move. On shipboard: "+getPassengers()+". There is "+getFloors()+" on the liner.");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}

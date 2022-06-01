package Homework.lesson7.task2;

public class Liner extends WaterVehicle{
    private int floors;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Liner(int pasagers, int floors) {
        super(pasagers);
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "\nThis is a liner" +
                "he have" + floors + " floors";
    }

    @Override
    public void isSailing(){
        System.out.println("Liner is sailing!");
    }
}

package Homework.lesson7.task2;

public class WaterVehicle extends Passagers implements Vehicle{

    public WaterVehicle(int pasagers) {
        super(pasagers);
    }

    public void isSailing() {
        System.out.println("Sailing!");
    }
}

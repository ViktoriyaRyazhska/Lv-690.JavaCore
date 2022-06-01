package Homework.lesson7.task2;

public class Car extends GroundVehicle{

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(int pasagers, String model) {
        super(pasagers);
        this.model = model;
    }

    @Override
    public String toString() {
        return "\nThis is " + model;
    }
}

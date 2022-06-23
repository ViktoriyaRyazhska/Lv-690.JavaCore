package HW6_OOP2;

public class Car extends GroundVehicle implements Vehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Let's drive! Welcome aboard"+getModel()+"! In the cabin: "+getPassengers());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

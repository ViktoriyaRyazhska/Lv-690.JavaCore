package HW7.task2;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passangers, String model) {
        super(passangers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' + " amount of passangers: " + getPassangers() +
                '}';
    }
}
package HomeWork.Vehicle;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passenger, String model) {
        super(passenger);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void drive() {
        System.out.println(getModel() + " on road");
    }

    @Override
    public void getInfo() {
        System.out.println("Passenger amount : " + getPassenger() +
                " Car model : " + getModel());


    }
}

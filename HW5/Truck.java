package HW5;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    void run() {
        System.out.println("Start running");
    }

    @Override
    void stop() {
        System.out.println("Start stopping");
    }
}

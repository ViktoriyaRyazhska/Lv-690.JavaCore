package PracticalTask1;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    void run() {
        System.out.println("Sedan running");
    }

    @Override
    void stop() {
        System.out.println("Sedan stop");
    }
}

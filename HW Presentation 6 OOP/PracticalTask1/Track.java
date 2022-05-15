package PracticalTask1;

public class Track extends Car {
    public Track(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    void run() {
        System.out.println("Start running");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }
}

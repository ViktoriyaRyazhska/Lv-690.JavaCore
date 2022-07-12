package HW5;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
   super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    void run() {
        System.out.println("Start running faster");
    }

    @Override
    void stop() {
        System.out.println("Stop immediately");
    }
}

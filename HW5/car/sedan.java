package practice.car;

public class sedan extends car {

    public sedan(String name, int year, int maxSpeed) {
        this.setName(name);
        this.setYear(year);
        this.setMaxSpeed(maxSpeed);
    }

    @Override
    public void run() {
        System.out.println("This car run " + this.getMaxSpeed());
    }

    @Override
    public void stop() {
        System.out.println("This car stop " + this.getName());
    }
}

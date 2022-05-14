package practice.car;

public abstract class car {

    private String name;
    private int year;
    private int maxSpeed;

    public void run() {
    }

    public void stop() {
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car name " + getName() +
                " Year " + getYear() +
                " Speed " + getMaxSpeed();
    }
}

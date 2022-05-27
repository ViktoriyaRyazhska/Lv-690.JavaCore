package HW7.task2;

public abstract class Passengers {
    private int passangers;

    public Passengers(int passangers) {
        this.passangers = passangers;
    }

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    @Override
    public String toString() {
        return "Passengers{" + "passangers=" + passangers + '}';
    }
}

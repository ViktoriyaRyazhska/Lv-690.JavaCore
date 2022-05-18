package HomeWork2;

public abstract class Passengers {
    private int pasangers;

    public Passengers(int pasangers) {
        this.pasangers = pasangers;
    }

    public int getPasangers() {
        return pasangers;
    }

    public void setPasangers(int pasangers) {
        this.pasangers = pasangers;
    }

    @Override
    public String toString() {
        return "Passengers{" + "pasangers=" + pasangers + '}';
    }
}

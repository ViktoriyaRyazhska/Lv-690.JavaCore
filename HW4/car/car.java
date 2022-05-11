package car;

public class car {
    String carFields;
    int year;
    String engine;

    public car(String carF, int year, String engine) {
        this.carFields = carF;
        this.year = year;
        this.engine = engine;
    }

    public String getCarFields() {
        return carFields;
    }

    public int getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Year :" + getYear() + " Car field :" + getCarFields() + " Engine :" + getEngine();
    }

    public String getInfo() {
        return "Car field :" + getCarFields() + " Year :" + getYear();
    }


}

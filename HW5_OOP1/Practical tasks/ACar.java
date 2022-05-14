package JavaCore;

public abstract class ACar {

    protected String model;
    protected int maxSpeed;
    protected int year;

    public ACar(String model, int maxSpeed, int year) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public ACar() {
    }

    public void run(){
     }
    public void stop(){
    }

    @Override
    public String toString() {
        return "ACar{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                '}';
    }
}

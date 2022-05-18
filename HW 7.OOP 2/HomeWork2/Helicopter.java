package HomeWork2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxWeight;

    public Helicopter(int pasangers, int weight, int maxWeight) {
        super(pasangers);
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void fly() {
        System.out.println("I can fly");
    }

    public void land() {
        System.out.println("I am landing now");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "weight=" + weight +
                ", maxWeight=" + maxWeight + " amount of passangers -" + getPasangers() +
                '}';
    }
}

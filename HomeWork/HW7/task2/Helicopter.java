package HW7.task2;


public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxWeight;

    public Helicopter(int passangers, int weight, int maxWeight) {
        super(passangers);
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
                ", maxWeight=" + maxWeight + " amount of passangers -" + getPassangers() +
                '}';
    }
}
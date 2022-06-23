package HW6_OOP2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Let's start, Helli! "+ "Our weight: "+this.getWeight() + " and we can move up: "+this.getMaxHeight()+". On board: "+getPassengers());
    }

    @Override
    public void land() {
        System.out.println("landing the Helicopter");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}

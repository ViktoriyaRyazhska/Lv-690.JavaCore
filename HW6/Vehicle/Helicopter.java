package HomeWork.Vehicle;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxWeight;

    public Helicopter(int passenger, int weight, int maxWeight) {
        super(passenger);
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter take off");
    }

    @Override
    public void land() {
        System.out.println("Helicopter landing");
    }

    @Override
    public void getInfo() {
        System.out.println("Passenger amount :" + getPassenger() +
                " Helicopter weight :" + getWeight() +
                " Helicopter max weight :" + getMaxWeight());

    }
}

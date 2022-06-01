package Homework.lesson7.task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int pasagers, int weight, int maxHeight) {
        super(pasagers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    @Override
    public void fly(){
        System.out.println("Helicopter taking off");
    }

    @Override
    public void land(){
        System.out.println("Helicopter landing");
    }

    @Override
    public String toString() {
        return "\n This is helicopter" +
                " his weight: " + weight +
                ", maxHeight=" + maxHeight;
    }
}

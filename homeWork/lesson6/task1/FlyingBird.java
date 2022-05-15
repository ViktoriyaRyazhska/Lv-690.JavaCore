package Homework.lesson6.task1;

public class FlyingBird extends Bird {

    public FlyingBird(String features, boolean layEggs) {
        super(features, layEggs);
    }

    @Override
    public String toString() {
        return "\nThis bird can fly and also " + this.getFeatures() + "\nCan this bird lay eggs? " + this.isLayEggs();
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

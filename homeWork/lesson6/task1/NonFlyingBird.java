package Homework.lesson6.task1;

public class NonFlyingBird extends Bird {


    public NonFlyingBird(String features, boolean layEggs) {
        super(features, layEggs);
    }

    @Override
    public String toString() {
        return "\nThis bird can`t fly and also " + this.getFeatures() + "\nCan this bird lay eggs? " + this.isLayEggs();
    }

    @Override
    public void fly() {
        System.out.println("This bird can`t fly :(");
    }
}

package HW5_OOP1_Inheritance;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't flyyyyyy....");
    }
}

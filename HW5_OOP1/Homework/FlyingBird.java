package HW5_OOP1_Inheritance;

public class FlyingBird extends Bird{

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can flyyyyyy....");
    }


}

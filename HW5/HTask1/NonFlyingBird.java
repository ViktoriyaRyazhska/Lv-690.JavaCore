package HW5.HTask1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, int layEggs) {
    setFeathers(feathers);
    setLayEggs(layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can't fly");
    }
}

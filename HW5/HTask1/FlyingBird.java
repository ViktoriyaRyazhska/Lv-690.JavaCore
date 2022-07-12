package HW5.HTask1;

public class FlyingBird extends Bird{
    public FlyingBird(String feathers, int layEggs) {
    setFeathers(feathers);
    setLayEggs(layEggs);}

    @Override
    public void fly() {
        System.out.println("This bird can fly");
    }
}

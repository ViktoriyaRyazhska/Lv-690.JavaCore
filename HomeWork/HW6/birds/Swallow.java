package HW6.birds;

public class Swallow extends FlyingBird {
    int feathers = 300;
    int layEggs = 20;

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
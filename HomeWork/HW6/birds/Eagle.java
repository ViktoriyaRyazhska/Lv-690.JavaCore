package HW6.birds;

public class Eagle extends FlyingBird {
    int feathers = 1500;
    int layEggs = 3;

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
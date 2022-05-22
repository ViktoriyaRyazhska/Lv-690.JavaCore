package HW6.birds;


public class Chicken extends NonFlyingBird {
    int feathers = 500;
    int layEggs = 10;

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
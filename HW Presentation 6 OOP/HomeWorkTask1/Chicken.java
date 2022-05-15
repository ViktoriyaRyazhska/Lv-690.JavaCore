package HomeWorkTask1;

public class Chicken extends NonFlyingBird {
    int feathers = 1000;
    int layEggs = 5;

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}

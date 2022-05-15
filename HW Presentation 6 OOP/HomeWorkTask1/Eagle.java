package HomeWorkTask1;

public class Eagle extends FlyingBird {
    int feathers = 500;
    int layEggs = 10;

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}

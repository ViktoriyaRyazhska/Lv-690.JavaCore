package HW6.birds;

public class Penguin extends NonFlyingBird {
    int layEggs = 7;

    @Override
    public String toString() {
        return "Penguin{" +
                "layEggs=" + layEggs +
                '}';
    }
}
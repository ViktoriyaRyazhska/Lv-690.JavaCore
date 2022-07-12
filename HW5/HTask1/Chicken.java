package HW5.HTask1;

public class Chicken extends NonFlyingBird {
    private final String type;

    public Chicken(String feathers, int layEggs, String type) {
        super(feathers, layEggs);
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println(this+" can't fly");
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "type=" + type +
                "} ";
    }
}


package HW5.HTask1;

public class Swallow extends FlyingBird{
    private final String type;

    public Swallow(String feathers, int layEggs, String type) {
        super(feathers, layEggs);
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println(this+" can fly");
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "type=" + type +
                "} ";
    }
}

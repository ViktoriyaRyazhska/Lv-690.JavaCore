package HW5.HTask1;

public class Penguin extends NonFlyingBird{
    public String type;

    public Penguin(String feathers, int layEggs, String type) {
        super(feathers, layEggs);
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println(this+" can't fly");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "type=" + type +
                "} ";
    }
}

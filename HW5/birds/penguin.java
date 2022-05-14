package homeWork.birds;

public class penguin extends nonFlyingBirds{
    private String type;

    public penguin(String type,String feathers, int layEggs) {
        super(feathers, layEggs);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public void fly() {
        System.out.println(this + ": can't fly");
    }
    @Override
    public String toString() {
        return "Bird : " + getType() +
                ": Feathers : " + getFeathers() +
                ": Lay eggs : " + getLayEggs();
    }
}

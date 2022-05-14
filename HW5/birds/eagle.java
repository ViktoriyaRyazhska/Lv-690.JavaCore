package homeWork.birds;

public class eagle extends flyingBirds {
    private String type;

    public eagle(String type, String feathers, int layEggs) {
        super(feathers, layEggs);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void fly() {
        System.out.println(this + ": can fly");
    }
    @Override
    public String toString() {
        return "Bird : " + getType() +
                ": Feathers : " + getFeathers() +
                ": Lay eggs : " + getLayEggs();
    }



}

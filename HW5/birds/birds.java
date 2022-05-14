package homeWork.birds;

public abstract class birds {

    private String feathers;
    private int layEggs;

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void fly(){}


}

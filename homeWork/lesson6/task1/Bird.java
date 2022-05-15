package Homework.lesson6.task1;

abstract public class Bird {
    private String features;
    private boolean layEggs;

    protected String getFeatures() {
        return features;
    }

    protected void setFeatures(String features) {
        this.features = features;
    }

    protected boolean isLayEggs() {
        return layEggs;
    }

    protected void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public Bird(String features, boolean layEggs) {
        this.features = features;
        this.layEggs = layEggs;
    }

    abstract public void fly();
}

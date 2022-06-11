package com.softserve.javacore;

public class NonFlyingBird extends Bird{

    private boolean isDomesticated;

    public NonFlyingBird() {};

    public NonFlyingBird(String feathers, int layEggs, boolean isDomesticated) {
        super(feathers, layEggs);
        this.isDomesticated = isDomesticated;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        NonFlyingBird that = (NonFlyingBird) o;

        return isDomesticated == that.isDomesticated;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isDomesticated ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "isDomesticated=" + isDomesticated +
                "} " + super.toString();
    }

    @Override
    public void fly() {
        System.out.println(String.format("%s is walking", this.getClass().getSimpleName()));
    }
}

package homeWork.birds;

public class nonFlyingBirds extends birds{

    public nonFlyingBirds(String feathers, int layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);

    }

    @Override
    public void fly() {
        System.out.println("This bird cant fly");
    }

}

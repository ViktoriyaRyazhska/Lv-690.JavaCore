package homeWork.birds;

public class flyingBirds extends birds {


    public flyingBirds(String feathers, int layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird fly");
    }



}

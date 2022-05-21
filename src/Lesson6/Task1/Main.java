package Lesson6.Task1;

public class Main {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        penguin.feathers = "penguin";

        Bird eagle = new Eagle();
        eagle.feathers = "eagle";

        Bird swallow = new Swallow();
        swallow.feathers = "swallow";

        Bird chicken = new Chicken();
        chicken.feathers = "chicken";

        Bird[] arrayBird = {eagle, swallow, penguin, chicken};
        for ( Bird bird : arrayBird ){
            bird.fly();
            System.out.println(bird.feathers);

        }

    }
}

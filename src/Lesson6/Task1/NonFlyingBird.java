package Lesson6.Task1;

public class NonFlyingBird extends Bird  {
    @Override
    public void fly() {
        System.out.println("The bird can not fly.");
    }
}
class Penguin extends NonFlyingBird  {
}

class Chicken extends NonFlyingBird {
}
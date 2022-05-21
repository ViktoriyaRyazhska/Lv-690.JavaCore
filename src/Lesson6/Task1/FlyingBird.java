package Lesson6.Task1;

public class FlyingBird extends Bird {


    @Override
    public void fly() {
        System.out.println("The bird can fly.");
    }
}
class Eagle extends FlyingBird {

}

class Swallow extends FlyingBird {
}


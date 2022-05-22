package HW6.birds;

abstract class NonFlyingBird extends Bird {
    public void fly() {
        System.out.println("I can not fly");
    }
}
package lesson8.Task2;

public class Main {
    public static void main(String[] args) {

        Wrapper<Integer> object1 = new Wrapper<>(5);
        Wrapper<String> object2 = new Wrapper<>("Kolya");
        Wrapper<Boolean> object3 = new Wrapper<>(true);
        System.out.println("object1: " + object1.getValue());
        System.out.println("object2: " + object2.getValue());
        System.out.println("object3: " + object3.getValue());
    }
}

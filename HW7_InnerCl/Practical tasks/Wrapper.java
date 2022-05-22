package HW7_InnerClasses;

public class Wrapper <T> {

    public Wrapper(T t) {
    }

    public static void main(String[] args) {

        Wrapper <Shape> squireWrapper = new Wrapper <> (new Square());
        Wrapper <Shape> circleWrapper = new Wrapper <> (new Circle());

    }

}

package HW8.practice2;

public class MainWrapper {

    public static void main(String[] args) {
Wrapper<Shape> squareWrapper=new Wrapper<>(new Square());
Wrapper<Shape> circleWrapper=new Wrapper<>(new Circle());

        System.out.println(squareWrapper);

    }
}

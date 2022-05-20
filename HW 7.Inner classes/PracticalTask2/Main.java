package PracticalTask2;

public class Main {
    public static void main(String[] args) {
WrapperShape<Shape> squareWrapperShape=new WrapperShape<>(new Square());
WrapperShape<Shape> circleWrapperShape=new WrapperShape<>(new Circle());
//        WrapperShape<String> ceWrapperShape=new WrapperShape<>("Hello");
//        якщо extend interface Shape -то нічо лишнє поставити не можемо.
        System.out.println(squareWrapperShape);

    }
}

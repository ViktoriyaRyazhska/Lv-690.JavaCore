//2. Create three classes:
//        Point with attributes x and y
//        Line which contains two object of Point class
//        ColorLine with attributes Color  which extends Line class.
//        Override method toString() and define method print() in every classes
//        In main() method create array of Line and add some Line and ColorLine to it.
//        Call method print() for all of it.
//


package PracticalTask2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

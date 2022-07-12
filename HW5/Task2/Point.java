package HW5.Task2;

public class Point {
private int x, y;
public Point (int x, int y) {
    this.x = x;
    this.y = y;
}

    @Override
    public String toString() {
        return "{" +
                x +
                "," + y +
                '}';
    }
}

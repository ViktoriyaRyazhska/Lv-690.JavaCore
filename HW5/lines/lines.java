package practice.lines;

public class lines {

    private point point1;
    private point point2;

    public lines(point point1, point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public point getPoint1() {
        return point1;
    }

    public point getPoint2() {
        return point2;
    }

    @Override
    public String toString() {
        return " Point 1 " + point1
                + " Point 2 " + point2;
    }
    public void print()
    {
        System.out.println(this);
    }
}

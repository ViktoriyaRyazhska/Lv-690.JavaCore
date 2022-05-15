package PracticalTask2;

public class ColorLine extends Line {

    private String color;

    public ColorLine(Point point1, Point point2) {
        super(point1, point2);
        this.color = "Red";
    }


    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}' + " Point 1 " + getPoint1() + " Point 2 " + getPoint2();
    }

    public void print() {
        System.out.println(this);
    }
}

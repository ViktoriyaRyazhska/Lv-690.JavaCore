package HW5.Task2;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public void print() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "{" +
                "color=" + color +
                "} " + super.toString();
    }
}

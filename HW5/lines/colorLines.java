package practice.lines;

public class colorLines extends lines {

    private String colorLines;

    public colorLines(point point1, point point2) {
        super(point1, point2);
        this.colorLines = "Red";

    }

    @Override
    public String toString() {
        return " Point 1 " + getPoint1()
                + " Point 2 " + getPoint2()
                + " Color Line " + colorLines;
    }

    public void print()
    {
        System.out.println(this);
    }

}

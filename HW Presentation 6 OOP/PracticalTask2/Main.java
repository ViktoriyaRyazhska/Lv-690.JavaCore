package PracticalTask2;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(10, 12), new Point(15, 10));
        Line line2 = new Line(new Point(3, 4), new Point(8, 9));
        Line ColorLine1 = new ColorLine(new Point(3, 4), new Point(8, 9));
        Line ColorLine2 = new ColorLine(new Point(11, 10), new Point(20, 30));

        Line[] arrayOfLines = {line1, line2, ColorLine1, ColorLine2};
        for (Line lines : arrayOfLines) {
            lines.print();
        }
    }
}



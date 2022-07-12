package HW5.Task2;

import static java.awt.Color.blue;

public class App1 {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new ColorLine(new Point(7, 12), new Point(4, 6), "blue");
        lines[1] = new Line(new Point(5, 9), new Point(4, 6));
        lines[2] = new ColorLine(new Point(2, 78), new Point(4, 4), "red");

        for (Line l : lines) {
            l.print();
        }
    }
}

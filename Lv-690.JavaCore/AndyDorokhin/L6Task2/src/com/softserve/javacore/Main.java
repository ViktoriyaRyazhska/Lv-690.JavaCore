package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);
        Point point4 = new Point(7, 8);

        Line line1 = new Line(point1, point2);
        ColorLine line2 = new ColorLine(point1, point3, "green");
        Line line3 = new Line(point1, point4);
        ColorLine line4 = new ColorLine(point2, point4, "blue");

        Line[] lines = {line1, line2, line3, line4};
        for (Line line: lines) {
            line.print();
        }
    }

}

package com.softserve.javacore;

public class Line {

    private Point point1;
    private Point point2;

    public Line() {};

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (point1 != null ? !point1.equals(line.point1) : line.point1 != null) return false;
        return point2 != null ? point2.equals(line.point2) : line.point2 == null;
    }

    @Override
    public int hashCode() {
        int result = point1 != null ? point1.hashCode() : 0;
        result = 31 * result + (point2 != null ? point2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}

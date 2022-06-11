package com.softserve.javacore;

public class ColorLine extends Line{

    private String color;

    public ColorLine() {};

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ColorLine colorLine = (ColorLine) o;

        return color != null ? color.equals(colorLine.color) : colorLine.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

    @Override
    public void print() {
        System.out.println("*** ColorLine info ***");
        super.print();
    }
}

package JavaCore;

public class ColorLine extends Line {

    private String color;

    public ColorLine(Point point1, Point point2) {
        super(point1, point2);
        this.color = "yellow";
    }

    public static void main(String[] args) {

        Line[]lines = new Line[2];
        lines[0] = new Line(new Point(1,2),new Point(3,5));
        lines[1] = new ColorLine(new Point(1,2),new Point(3,5));

        for (Line l:lines){
            l.print();
        }

    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
}

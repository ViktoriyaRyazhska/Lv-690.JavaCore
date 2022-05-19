package HW5Ls2Taks2;

public class ColorLine extends Line{
    private String color;
    public ColorLine(Point p1 , Point p2 , String color){
        super (p1 , p2);
        this.color = color;
    }
    @Override
    public String print(){
    return "point 1: " + p1.getX() + ", " + p1.getY() + " | point 2: " + p2.getX() + ", " + p2.getY() + " | color: " + color;
}

}
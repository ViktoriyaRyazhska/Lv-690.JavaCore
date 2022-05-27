package HW5Ls2Taks2;

public class Line {

    Point p1 ;
    Point p2 ;

    public Line(Point p1 , Point p2){
       this.p1 = p1;
       this.p2 = p2;
    }

    public String print(){
        return "point 1: " + p1.getX() + ", " + p1.getY() + " | point 2: " + p2.getX() + ", " + p2.getY();
    }


}
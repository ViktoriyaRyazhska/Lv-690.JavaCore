package HW6.colourLines;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

public String print(){
        return "point x = " + x + ", point y = " + y;
}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
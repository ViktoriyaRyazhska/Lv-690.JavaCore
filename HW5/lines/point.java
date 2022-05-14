package practice.lines;

public class point {

    private int x = 0;
    private int y = 0;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return " X " + x
                + " Y " + y;
    }
}

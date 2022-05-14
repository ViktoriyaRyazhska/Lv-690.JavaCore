package practice.lines;

public class main {
    public static void main(String[] args) {

        lines line1 = new lines(new point(23, 43), new point(12, 23));
        lines line2 = new lines(new point(12, 43), new point(89, 23));
        lines colorLines1 = new colorLines(new point(34, 23), new point(45, 56));
        lines colorLines2 = new colorLines(new point(345, 23), new point(45, 78));

        lines[] linesArrays = {line1, colorLines1, line2, colorLines2};

        for (lines lin : linesArrays) {
            lin.print();
        }
    }
}

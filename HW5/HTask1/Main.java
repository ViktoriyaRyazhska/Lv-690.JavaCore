package HW5.HTask1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("grey", 5, "hawk");
        birds[1] = new Swallow("black", 4, "barn swallow");
        birds[2] = new Penguin("white", 2, "king penguin");
        birds[3] = new Chicken("yellow", 20, "hen");

        birdType(birds);
    }

    public static void birdType(Bird[] birds) {
        for (Bird b : birds) {
            b.fly();
        }
    }
}

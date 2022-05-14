package homeWork.birds;

public class main {
    public static void main(String[] args) {

        birds eagle1 = new eagle("Bald Eagles", "dark brown", 6);
        birds swallow1 = new swallow("Barn swallow", "darker ", 7);
        birds penguin1 = new penguin("King Penguin", "bright orange ", 3);
        birds chicken1 = new chicken(" Barnevelder chicken", "brown and black ", 5);

        birds[] birds = {eagle1, swallow1, penguin1, chicken1};
        birdType(birds);

    }

    public static void birdType(birds[] birds) {
        for (birds bi : birds) {
            bi.fly();
        }
    }
}

package Homework.lesson6.task1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Bird[] birds = new Bird[5];
        birds[0] = new Eagle("Flying fast",true);
        birds[1] = new Chicken("Pretty tasty", true);
        birds[2] = new Penguin("Very cute", true);
        birds[3] = new Swallow("Tiny one", true);
        birds[4] = new Eagle("Big one", true);

        for (Bird elem : birds) {
            elem.fly();
        }
        System.out.println(Arrays.toString(birds));
    }
}


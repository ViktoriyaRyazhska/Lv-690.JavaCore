package HomeWorkTask1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Bird> bird = new ArrayList<>();
        bird.add(new Eagle());
        bird.add(new Swallow());
        bird.add(new Penguin());
        bird.add(new Chicken());

        for (Bird l : bird) {
            System.out.println(l);
            l.fly();

        }


    }
}

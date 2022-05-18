//        Create interface Animal with methods voice() and feed().
//        Create two classes Cat and Dog, which implement this interface.
//        Create array of Animal and add some Cats and Dogs to it.
//        Call voice() and feed() method for all of it


package PracticalTask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal [] anim={new Cat("Leo"),new Dog("Mark")};
        for (Animal a:anim){
            a.feed();
            a.voice();
        }
        List<Animal> arraysAnim=new ArrayList<>();
        arraysAnim.add(new Cat("Maks"));
        arraysAnim.add(new Dog("Frans"));
        for(Animal an:arraysAnim){
            an.voice();
            an.feed();
        }

    }
}

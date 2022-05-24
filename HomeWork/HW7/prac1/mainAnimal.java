//Create interface Animal with methods voice() and feed().
//Create two classes Cat and Dog, which implement this interface. 
//Create array of Animal and add some Cats and Dogs to it. 
//Call voice() and feed() method for all of it




package HW7.prac1;

import java.util.ArrayList;
import java.util.List;

public class mainAnimal {
    public static void main(String[] args) {
        Animals [] anim={new Cats("Tom"),new Dogs("Scoobe"),new Cats("Jerry"),new Dogs("Teddy") };
        for (Animals a:anim){
            a.feed();
            a.voice();
        }
        List<Animals> arraysAnim=new ArrayList<>();
        arraysAnim.add(new Cats("Jasmin"));
        arraysAnim.add(new Cats("Jassy"));
        arraysAnim.add(new Dogs("Furi"));
        for(Animals an:arraysAnim){
            an.voice();
            an.feed();
        }

    }
}
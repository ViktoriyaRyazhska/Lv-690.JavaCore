//Create next structure.
//        In abstract class Person with property name, declare abstract method print().
//        In other classes in body of method print() output text “I am a …”.
//        In class Staff declare abstract method salary().
//        In each concrete class create constant TYPE_PERSON.
//        Output type of person in each constructors.
//        Create array of Person and add some Teachers, Cleaners and Students to it.
//        Call method print() for all of it. Call method salary() for all Teachers and Cleaner

package PracticalTask2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new Teachers("Ilona",10000));
        list.add(new Teachers("Nastia",8000));
        list.add(new Cleaner("Nazar",5000));
        list.add(new Cleaner("Mark",5000));
        list.add(new Student("Solomia"));
        list.add(new Student("Sofia"));
        for(Person p:list){
            p.print();
            if(p instanceof Staff){
                ((Staff) p).salary();
            }
        }

    }
}

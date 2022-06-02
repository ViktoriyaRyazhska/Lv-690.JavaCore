//        Create interface Animal with methods voice() and feed().
//        Create two classes Cat and Dog, which implement this interface.
//        Create array of Animal and add some Cats and Dogs to it.
//        Call voice() and feed() method for all of it


package PracticalTask1;

public class Dog implements Animal {
   private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(getName()+ "  Dog make voice");
    }

    @Override
    public void feed() {
        System.out.println(getName()+ "  Dog is eating");
    }
}
package HW7.prac1;


public class Cats implements Animals {
    private String name;

    public Cats(String name) {
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
        System.out.println(getName()+ "  Cat is meawing ");
    }

    @Override
    public void feed() {
        System.out.println(getName() + "   Cat is eating");
    }
}
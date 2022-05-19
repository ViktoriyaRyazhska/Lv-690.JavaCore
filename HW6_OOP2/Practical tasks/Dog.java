package HW6_OOP2;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice(){
        System.out.println("woof");
    }

    @Override
    public void feed(){
        System.out.println(this.getName() +" is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

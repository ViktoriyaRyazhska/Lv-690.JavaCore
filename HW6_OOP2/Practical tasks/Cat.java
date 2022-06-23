package HW6_OOP2;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice(){
        System.out.println("meow");
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

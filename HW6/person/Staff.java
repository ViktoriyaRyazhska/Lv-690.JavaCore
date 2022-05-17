package Practice.person;

public abstract class Staff extends Person {

    public Staff(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public void print() {
        System.out.println("i am person");
    }
    public abstract void salary();


}

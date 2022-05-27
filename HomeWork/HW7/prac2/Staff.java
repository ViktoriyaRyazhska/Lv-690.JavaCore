package HW7.prac2;


public abstract class Staff extends Person{
    public Staff(String name) {
        super(name);
    }
    public void print(){
        System.out.println("I am a Staff");
    }
    public abstract void salary();
}
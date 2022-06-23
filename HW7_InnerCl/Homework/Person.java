package HW7_InnerClasses;

public abstract class Person {

    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract String activity();

    public String info(){
        StringBuilder s = new StringBuilder("");
        s.append("First name: "+getFullName().getFirstName());
        s.append(", ");
        s.append("last name: "+getFullName().getLastName());
        s.append(", ");
        s.append("Age: "+getAge());
        return s.toString();
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package lesson8.Task1;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;

    }
    public void info() {

        System.out.print("First name:" + fullName.getFirstName() + " Last name: " + fullName.getLastName() + " Age: " + age );

    }

    public abstract String activity();
}

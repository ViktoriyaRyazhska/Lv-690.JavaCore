package HW3.sdog;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "HW3.Dog.Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    static void checkName(Dog a, Dog b, Dog c) {
        if (a.name == b.name || a.name == c.name || b.name == c.name) {
            System.out.println("Some dogs have the same names");
        } else {
            System.out.println("No matches");
        }
    }

    public static Dog oldestDog(Dog a, Dog b, Dog c) {
        Dog oldest = a;
        if (oldest.age < b.age) {
            oldest = b;
        }
        if (oldest.age < c.age) {
            oldest = c;
        }
        return oldest;
    }

    public static void printOldestDog(Dog a) {
        System.out.println("The oldest dog: ");
        System.out.println("Name " + a.name);
        System.out.println("Breed " + a.breed);
        System.out.println("Age " + a.age);
    }
}

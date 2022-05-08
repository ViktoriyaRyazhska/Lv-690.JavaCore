package Homework.lesson4;

public class Dog {
    private Breed breed;
    private String name;
    private int age;

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Dog{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void checkNames(Dog a, Dog b, Dog c) {
        if (a.name != b.name && a.name != c.name && c.name != b.name) {
            System.out.println("No matches");
        } else {
            System.out.println("Some dogs have the same names");
        }
    }

    public static Dog oldestDog(Dog a, Dog b) {
        return a.age > b.age ? a : b;
    }

    public static void getTheOldestDog(Dog a) {
        System.out.println("The oldest dog");
        System.out.println("Name - " + a.name);
        System.out.println("Breed - " + a.breed);
        System.out.println("Age - " + a.age);
    }

    public static void main(String[] args) {
        Dog goodDog = new Dog("Byron", Breed.LABRADOR, 8);
        Dog badDog = new Dog("Draco", Breed.BEAGLE, 11);
        Dog regularDog = new Dog("Bob", Breed.BULLDOG, 7);
        Dog.checkNames(goodDog, badDog, regularDog);
        badDog.setName("Bob");
        Dog.checkNames(goodDog, badDog, regularDog);
        Dog.getTheOldestDog(Dog.oldestDog(Dog.oldestDog(goodDog, badDog), regularDog));

    }
}


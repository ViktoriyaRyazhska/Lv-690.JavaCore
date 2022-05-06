//Сreate class Dog with fields name, breed, age.
//        Declare enum for field breed.
//        Create 3 instances of type Dog.
//        Check if there is no two dogs with the same name.
//        Display the name and the kind of the oldest dog.

import java.util.Objects;

public class CreateDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Frans", BreedDog.АЛАБАЙ, 5);
        Dog dog2 = new Dog("Tuzik", BreedDog.МАЛАМУТ, 4);
        Dog dog3 = new Dog("Leo", BreedDog.ВІВЧАРКА, 3);

        System.out.println("Якщо true - імена собак повторюються, false -імена не повторюються.");
        System.out.println(dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3));
        System.out.println();
        System.out.println("Виводимо ім'я і вид найстарішої собаки.");
        System.out.println(oldestDog(dog1, oldestDog(dog2, dog3)).getNameKind());
        System.out.println();
        dog1.setName("Leo");
        System.out.println("Поміняли ім'я собаки, для провірки методу на повтор імен, True - імена собак повторюються, False -імена не повторюються.");
        System.out.println(dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3));
    }

    private static Dog oldestDog(Dog dog1, Dog dog2) {
        return dog1.getAge() > dog2.getAge() ? dog1 : dog2;
    }
}

class Dog {
    private String name;
    private int age;
    private BreedDog breed;

    public Dog(String name, BreedDog breed, int age) {
        this.name = name;
        this.age = age;
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

    public BreedDog getBreed() {
        return breed;
    }

    public void setBreed(BreedDog breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(getName(), dog.getName());
    }


    public String getNameKind() {
        return "Dog-собака, з найбільшим віком -------  {" + "name='" + name + '\'' + ", breed=" + breed + '}';
    }
}

enum BreedDog {
    ВІВЧАРКА, АЛАБАЙ, МАЛАМУТ, БУЛЬДОГ
}


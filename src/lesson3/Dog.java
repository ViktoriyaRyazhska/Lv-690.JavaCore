package lesson3;

import java.util.Scanner;

public class Dog {
    public String name;
    public BreedDog breed;
    public int age;


    public Dog(String name, BreedDog breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bella", BreedDog.DACHSHUND, 5);
        Dog dog2 = new Dog("Busiya", BreedDog.YORKIE, 10);
        Dog dog3 = new Dog("Luts", BreedDog.SPANIEL, 3);
        if (dog1.checkName(dog2.name) || dog2.checkName(dog3.name) || dog3.checkName(dog1.name)) {
            System.out.println("There is two dogs with the same name");
        } else {
            System.out.println("There is no two dogs with the same name");
        }
        Dog maxDog = dog1;
        if (dog2.age > maxDog.age) {
            maxDog = dog2;
        }
        if (dog3.age > maxDog.age) {
            maxDog = dog3;
        }
        System.out.println("The name and the kind of the oldest dog: " + maxDog.name + " " + maxDog.breed + " " + maxDog.age);

    }

    public enum BreedDog {
        DACHSHUND("Hunting dog breed. There are several varieties of dachshunds, differing in size and weight"),
        YORKIE("The Yorkie is energetic, temperamental and domineering, but also a very affectionate dog."),
        SPANIEL("The Spaniel is a harmoniously built dog of small stature. " +
                "The coat is silky, of medium length, the ears are hanging, low set, very long."),
        NO_BREED("No this breed");

        public final String description;

        BreedDog(String description) {
            this.description = description;
        }
    }

    public boolean checkName(String otherName) {
        return name.equals(otherName);
    }
}






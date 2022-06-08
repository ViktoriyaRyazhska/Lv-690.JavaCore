package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog1 = new Dog("Nike", DogBreed.GERMAN_SHEPHERD, 10);
        Dog dog2 = new Dog("Lizzy", DogBreed.CHIHUAHUA, 3);
        Dog dog3 = new Dog("LIZZY", DogBreed.LABRADOR, 5);

        checkSameName(dog1, dog2, dog3);

        Dog oldestDog = findOldestDog(dog1, dog2, dog3);
        System.out.println("Oldest dog:");
        System.out.println(oldestDog.getName());
        System.out.println(oldestDog.getBreed());

    }

    private static Dog findOldestDog(Dog ... dogs) {
        Dog oldestDog = new Dog();

        for (Dog dog : dogs) {
            if (dog.getAge() > oldestDog.getAge()) {
                oldestDog = dog;
            }
        }

        return oldestDog;
    }


    static boolean checkSameName(Dog ... dogs) {
    // not case sensetive check, eg "Andy" and "ANDY" is the same name

        for (Dog firstDog : dogs) {
            for (Dog secondDog : dogs) {
                if (!firstDog.equals(secondDog) && firstDog.getName().equalsIgnoreCase(secondDog.getName())) {
                    System.out.println("Found dogs with the same name:");
                    System.out.println(firstDog);
                    System.out.println(secondDog);
                    return true;

                }
            }
        }

        System.out.println("No dogs with the same name.");
        return false;

    }

}

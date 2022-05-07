package Dog;

import Dog.breed;

public class main {
    public static void main(String[] args) {

        dog dog1 = new dog("jack", 7, breed.BULLDOG);
        dog dog2 = new dog("fink", 9, breed.DOBERMANN);
        dog dog3 = new dog("toby", 12, breed.PUG);

        dog.NameChecker(dog1, dog2, dog3);
        dog.OldestDog(dog1, dog2, dog3);


    }
}

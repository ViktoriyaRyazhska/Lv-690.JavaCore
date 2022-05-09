public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setBreed(Breed.LAB);
        dog1.setName("Mike");
        dog1.setAge(6);

        Dog dog2 = new Dog();
        dog2.setBreed(Breed.DOBERMAN);
        dog2.setName("Rex");
        dog2.setAge(5);

        Dog dog3 = new Dog();
        dog3.setBreed(Breed.SHEPPARD);
        dog3.setName("Wolfy");
        dog3.setAge(11);
        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println("Breed of eldest dog is " + Breed.LAB);
        } else if (dog2.getAge() > dog3.getAge()) {
            System.out.println("Breed of eldest dog is " + Breed.DOBERMAN);

        } else {
            System.out.println("Breed of eldest dog is " + Breed.SHEPPARD);
        }

        if (dog1.getName() == dog2.getName() ||
                dog2.getName() == dog3.getName() ||
                dog3.getName() == dog1.getName()) {
            System.out.println(" some of dogs have same name");
        } else {
            System.out.println("all dogs have different name");
        }


    }
}
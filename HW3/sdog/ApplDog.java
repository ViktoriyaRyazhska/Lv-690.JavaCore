package HW3.sdog;

public class ApplDog {
    public static void main(String[] args) {
        Dog a = new Dog("Bim", Breed.BEAGLE, 13);
        Dog b = new Dog("Sim", Breed.SPANIEL, 8);
        Dog c = new Dog("Sim", Breed.MOPS, 11);
        Dog.checkName(a, b, c);
        Dog.printOldestDog(Dog.oldestDog(a, b, c));

    }

}

package ls7.Animal;

/*
 * Create interface Animal with methods voice() and feed().
 * Create two classes Cat and Dog, which implement this interface. 
 * Create array of Animal and add some Cats and Dogs to it. 
 * Call voice() and feed() method for all of it
 */

import java.util.ArrayList;

import ls4.BreedOfDogs;

public class Task7_1 {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Cat("Murka", 10));
		animals.add(new Dog("Sharik", 5, BreedOfDogs.BEAGLE));
		animals.add(new Cat("Barsic", 8));
		animals.add(new Dog("Bobik", 12, BreedOfDogs.FRENCH_BULDOG));
		animals.add(new Dog("Tuzick", 15, BreedOfDogs.GERMAN_SHEPHERD));
		animals.add(new Cat("Knopa", 4));
		
		for (Animal animal : animals) {
			if (animal instanceof Cat) {
				((Cat) animal).print((Cat) animal);
			}
			System.out.println(animal.feed());
			System.out.println(animal.voice());		
		
		}
	}

}

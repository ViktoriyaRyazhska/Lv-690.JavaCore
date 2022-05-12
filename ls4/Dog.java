package ls4;

import java.util.ArrayList;
import java.util.Objects;

public class Dog {
	private String name;
	private BreedOfDogs breed;
	private int age;
	static ArrayList<Dog> arDogs = new ArrayList<>();
	
	public Dog(String name, BreedOfDogs breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		arDogs.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BreedOfDogs getBreed() {
		return breed;
	}

	public void setBreed(BreedOfDogs breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
		
	public String printNameBreed() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}
	
	public boolean checkWithTheSameName(Dog dog) { 		
		return this.getName().equals(dog.getName());
	}

	public static void oldestDog () {
		Dog dog = arDogs.get(0);
		for (int i = 1; i < arDogs.size(); i++) {
			if (dog.getAge() < arDogs.get(i).getAge()) {
				dog = arDogs.get(i);
			}
		}
		System.out.println("The oldest dog: " + dog.printNameBreed());
	}
	
	@Override
 	public int hashCode() {
		return Objects.hash(age, breed, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && breed == other.breed && Objects.equals(name, other.name);
	}
	
}

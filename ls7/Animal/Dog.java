package ls7.Animal;

import ls4.BreedOfDogs;

public class Dog implements Animal{
	private String name;
	private int age;
	private BreedOfDogs breed;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public BreedOfDogs getBreed() {
		return breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBreed(BreedOfDogs breed) {
		this.breed = breed;
	}

	
	public Dog(String name, int age, BreedOfDogs breed) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	
	@Override
	public String voice() {		
		return name + " says Gav";
	}

	@Override
	public String feed() {		
		return name +" like eats meat";
	}

	@Override
	public String toString() {
		return "I`m a dog breed" + breed + ", my name is " + name + " , age is " + age + "." + feed();
	}
		
	public void print(Dog dog) {
		System.out.println(dog);
	}
	
	

}

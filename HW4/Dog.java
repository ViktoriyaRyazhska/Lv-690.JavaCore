package Homework4;

import Homework4.Main.Breeds;

public class Dog {
	private Breeds breed;
	private String name;
	private int age;
	public Dog(Breeds breed, String name, int age) {
		super();
		this.breed = breed;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return breed + " "+ name + ", age " + age;
	}
	public Breeds getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}

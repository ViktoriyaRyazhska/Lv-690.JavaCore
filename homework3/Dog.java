package homework3;


public class Dog {
	String name;
	String breed;
	int age;
	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public static void main(String[] args) {
		Methods mt=new Methods();
		mt.oldDog();
		mt.checkName();	
	}
}

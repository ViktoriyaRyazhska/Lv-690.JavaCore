package Person;

import java.io.IOException;

public class Persons5 {

	public static void main(String[] args) throws IOException {

		Person person1 = new Person("Andrew", "Shmyrko");
		person1.setBirthYear(1985);
		System.out.println("Person information= " + person1.output());
		System.out.println("Person age= " + person1.getAge());
		System.out.println();

		Person person2 = new Person("Volodymyr", "Zakaluzny");
		person2.setBirthYear(1977);
		System.out.println("Person information= " + person2.output());
		System.out.println("Person age= " + person2.getAge());
		person2.changeName("Vladyslav", "Zakaluzny");
		person2.setBirthYear(1978);
		System.out.println("Person information= " + person2.output());
		System.out.println("Person age= " + person2.getAge());
		System.out.println();

		Person person3 = new Person();
		person3.setFirstName("Yurij");
		person3.setLastName("Dovgan");
		person3.setBirthYear(1983);
		System.out.println("Person information= " + person3.output());
		System.out.println("Person age= " + person3.getAge());
		System.out.println();

		Person person4 = new Person();
		person4.setFirstName("Viktor");
		person4.setLastName("Bojko");
		person4.setBirthYear(1954);
		System.out.println("Person information= " + person4.output());
		System.out.println("Person age= " + person4.getAge());
		System.out.println();

		Person person5 = new Person();
		person5.input();
		System.out.println("Person information= " + person5.output());
		System.out.println("Person age= " + person5.getAge());
	}

}
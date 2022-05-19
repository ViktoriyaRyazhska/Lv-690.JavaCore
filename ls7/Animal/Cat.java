package ls7.Animal;

public class Cat implements Animal{
	private String name;
	private int age;

	public Cat(String name, int age) {		
		this.name = name;
		this.age = age;
	}	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String voice() {		
		return name + " says meow";
	}

	@Override
	public String feed() {		
		return name + " like eats fish";
	}

	@Override
	public String toString() {
		return " I`m a cat, my name is " + name + ", age is " + age + "." + feed();
	}
	
	public void print(Cat cat) {
		System.out.println(cat);
	}
}

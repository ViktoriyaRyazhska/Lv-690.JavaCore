package homework3;


public class Dog {
	private String name;
	private int age;
	private Enumbreed type;
	public Dog(String name, Enumbreed type, int age) {
		this.name = name;
		this.type= type;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Enumbreed getType() {
		return type;
	}

	public void setType(Enumbreed type) {
		this.type = type;
	}

	public static void main(String[] args) {
		Methods mt=new Methods();
		mt.oldDog();
		mt.checkName();	
		
	}
}

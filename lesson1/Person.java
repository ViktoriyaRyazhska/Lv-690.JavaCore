package lesson1;

public class Person {
	private	String firstName;
	private String lastName;
	private int birthYear;
	public Person(String firstName, String lastName, int birthYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getAge(int age) {
		int birthYear = 2022-age;
		this.birthYear=birthYear;
		return birthYear;
		
	}	
public void input(String firstName, String lastName) {
		
	}
	public void output() {
		System.out.println(firstName+" "+lastName+" age: "+birthYear);
		System.out.println();
	}
	public void changeName(String fn, String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	
	public static void main(String[] args) {
		Person men1=new Person("Nazar","Futer");		
		men1.getAge(2001);
		men1.output();
		
		Person men2=new Person("Ivan","Bebra");
		men2.input("Ivanov","Yorvikk");
		men2.output();
		
		Person men3=new Person("Danil","Pypik");
		men3.changeName("Yuri","Chana");
		men3.getAge(2003);
		men3.output();
		
		Person men4=new Person("Orest","Bober");
		men4.getAge(1984);
		men4.output();
		
		Person men5=new Person("23","34");
		men5.changeName("Vasya","Bybliks");
		men5.birthYear=2001;
		men5.getAge(1999);
		men5.output();
	}
}

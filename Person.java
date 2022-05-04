import java.util.Scanner;

public class Person {
	Scanner scan =new Scanner(System.in);
	
	private int b;
	public Person(int b, String fn, String ln) {
		super();
		this.b = b;
		this.fn = fn;
		this.ln = ln;
	}
	private String fn;
	private String ln;
	public Person(String fn, String ln) {
		super();
		this.fn = fn;
		this.ln = ln;
}
 public	int getAge(int c){
	 b= 2022 -c;
	 return b;
	}
 
 public void input(String fn,String ln ,int b) {
	 String fnn= scan.nextLine();
	 String lnn= scan.nextLine();
	 String br=scan.nextLine();
	 
	 int bb= Integer.parseInt(br);
	 this.fn=fnn;
	 this.ln=lnn;
	 this.b=bb;
}
 public void output(){
	System.out.println("Your name "+fn+" Your last name "+ln+" age "+b);
 }
 
 public void changeName(String fn, String ln) {
	this.fn=fn;
	this.ln=ln;
	}
 public static void main(String[] args) {
	Person person1= new Person("Nazar", "Sobchak");
	person1.getAge(1939);
	
	Person person2= new Person("Oles", "Shevchuk");
	person2.getAge(1924);
	person2.changeName("Andriy", "Sadovyi");
	Person person3= new Person("Vasya", "Pupkin");
	person3.getAge(1821 );
	
	Person person4= new Person("Vitaliy", "Tsal");
	person4.getAge(1953);
	
	Person person5= new Person("Taras", "Slumak");
	person5.getAge(1945);
	person5.changeName("Slavik","Pepsi");
	
	person1.output();
	person2.output();
	person3.output();
	person4.output();
	person5.output();
	
	
}
 
	}



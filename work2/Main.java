package work2;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Wilson","Higgsbury");
		Person p3 = new Person();
		Person p4 = new Person("Wendy","Carter");
		Person p5 = new Person("Walter","Wickerbottom");
		
		p1.setfName("Wes");
		p1.setlName("Carter");
		System.out.println("first name of person 1 is " + p1.getfName() + " and last - " + p1.getlName());
		
		System.out.println("");
		
		System.out.println("set the wrong year(1800), and program answer:");
		p3.setBirthYear(1800);
		p3.setBirthYear(1984);
		System.out.println("birth year of person 3 is " + p3.getBirthYear() + " and age is  " + p3.getAge() + " or " + (p3.getAge()-1));
		
		System.out.println("");
		
		p4.input();
		p4.output();
		
		System.out.println("");
		
		p5.changeName("Walter", "Warbucks");
		p5.setBirthYear(1999);
		p5.output();
	}

}

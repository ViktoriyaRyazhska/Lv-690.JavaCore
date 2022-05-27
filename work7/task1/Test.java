package work7.task1;

public class Test {
	
	public static void main(String[] args) {
		Student s1 = new Student(new Person.FullName("Thomas","Jefferson"),19,2);
		Student s2 = new Student(new Person.FullName("Andy","Hoffman"),20,4);
		
		System.out.println(s1.info());
		System.out.println(s1.activity());
		System.out.println(s2.info());
		System.out.println(s2.activity());
	}

}

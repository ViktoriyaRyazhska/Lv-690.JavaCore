package hm7;

public class Maine {
 public static void main(String[] args) {
	
	 Person s1 = new Student("Zahar", "Veres", 22, 5);
	 Person s2 = new Student("Slavik", "Matiz", 19, 4);
	
	 Person[] s = new Person[] {
		s1, s2	 
	 };
	 for(Person ss: s) {
		 System.out.println(ss.info());
		 System.out.println(ss.activity());
	 }
}
 	
}

package ls7.Person;

/*
 * Create next structure. In abstract class Person with property name, 
 * declare abstract method print(). 
 * In other classes in body of method print() output text “I am a …”. 
 * In class Staff declare abstract method salary(). 
 * In each concrete class create constant TYPE_PERSON. 
 * Output type of person in each constructors. 
 * Create array of Person and add some Teachers, Cleaners and Students to it. 
 * Call method print() for all of it. Call method salary() for all Teachers and Cleaner
 */

import java.util.ArrayList;

public class Task7_2 {
	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Student("Taras"));
		persons.add(new Teacher("Maryna", 20152.32));
		persons.add(new Cleaner("Maksim", 15232.56));
		
		for (Person person : persons) {
			person.print();
			if (person instanceof Staff) {
				((Staff)person).salary();
			}
		}
		
		
	}

}

package ls8.Homework_Task_1;
/*
 * Develop a Student class with an int field that matches the course the student is taking. 
 * In the Student class, create a constructor with parameters to initialize all fields 
 * in the class, and override the info() method (which would also add course information 
 * to the previous line), and the activity() method from the Person class. 
 * The activity() method should return a string value that is the type of activity for 
 * the corresponding Person subtype, for example for a student - this could be 
 * the value "I study at university". 
 * In the main(...) method, create two instances of the Student class and output 
 * information about them by calling the appropriate methods info() and activity().
 */


public class Homework_Task_1_Main {

	public static void main(String[] args) {
		Person student1 = new Student(new FullName("Vasia", "Petrov"), 18, 225);
		Person student2 = new Student(new FullName("Katia", "Korol"), 17, 201);
		System.out.println(student1.activity());
		System.out.println(student1.info());
		System.out.println(student2.activity());
		System.out.println(student2.info());

	}

}

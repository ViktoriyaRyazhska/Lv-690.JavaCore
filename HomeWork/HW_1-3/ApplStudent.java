package Student;

public class ApplStudent {

		public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Andrew");
		student1.setRait(3);
		
		Student student2 = new Student("Nathaly");
		student2.setRait(4);
		student2.setRait(5);
		
		Student student3 = new Student("Igor", 3);
		student3.setRait(4);
		
		
		System.out.println("Out students");
		System.out.println(student1.toString());
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println();
		System.out.print("Student 1 has better rating than student2 ");
		System.out.println(student1.betterStudent(student2));
		System.out.println();
		System.out.printf("Average rating is " + "%.2f", Student.getAvgRating());
		}

		}
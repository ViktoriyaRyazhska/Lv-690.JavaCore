package homework7;

public class Main {
	public static void main(String[] args) {
		Person std1 = new Student("Taras","Bulba",18,2);
		Person std2 = new Student("Ivan","Bebra",17,1);
		
		Person[] arr = new Person[] {std1,std2};
		
		for(Person elements : arr) {
			System.out.println(elements.info());
			System.out.println(elements.activity());
		}
		
	}
}

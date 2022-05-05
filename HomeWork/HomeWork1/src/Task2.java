import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, adress; 
		System.out.println("What is your name?");
		name = sc.nextLine();
		System.out.println("Where are you live, "+ name);
		adress = sc.nextLine();
		System.out.println(name + " " +adress);
		
	}

}

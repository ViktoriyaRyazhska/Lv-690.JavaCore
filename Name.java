import java.util.Scanner;

public class Name {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	
	System.out.println("What is your name?");
	String name= scan.nextLine();
	System.out.println("Where are you live? "+name);
	String live= scan.nextLine();
	System.out.println(name+" live in "+live);
	
	
}
}

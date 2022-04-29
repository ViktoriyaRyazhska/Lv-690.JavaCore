package work1;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		String name;
		String address;
		
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		
		System.out.println("Where are you live, " + name + "?");
		address = sc.nextLine();
		
		System.out.println("Your name: " + name);
		System.out.println("Your address: " + address);
	}
}

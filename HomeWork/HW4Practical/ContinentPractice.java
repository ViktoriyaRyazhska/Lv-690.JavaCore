//Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)


package HW4Practical;

import java.util.Scanner;

public class ContinentPractice {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the name of country");
		String nameOfCountry = sc.nextLine();
		switch (nameOfCountry.toUpperCase()) {
		case "UKRAINE":
			System.out.println(Continent.EURASIA);
			break;
		case "FRANCE":
			System.out.println(Continent.EURASIA);
			break;
		case "USA":
			System.out.println( Continent.NORTH_AMERICA);
			break;
		case "BRASIL":
			System.out.println( Continent.SOUTH_AMERICA);
			break;
		case "Kongo":
			System.out.println( Continent.AFRICA);
			break;
		case "AUSTRALIA":
			System.out.println(Continent.AUSTRALIA);
			break;
		default:
			System.out.println("Enter another country. This is only a test program.");
		}

	}
}

enum Continent {
	EURASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA
}
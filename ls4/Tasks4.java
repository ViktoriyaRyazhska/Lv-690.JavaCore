package ls4;

/*
 * 1. Enter three numbers. Find out how many of them are odd.
 * 2. Enter the number of the day of the week. Display the name in three languages.
 * 3. Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
 * 4. Create class Product with fields name, price and quantity.
 *   - Create four instances of type Product. 
 *   - Display the name and quantity of the most expensive item.
 *   - Display the name of the items, which has the biggest quantity.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Tasks4 {

	private static Continent continent;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Product p1 = new Product("Tomato", 10.5, 100);
		Product p2 = new Product("Apple", 15.50, 200);
		Product p3 = new Product("Egg", 2.50, 1000);
		Product p4 = new Product("Carrot",8.50 , 1500);
		countNumberOfOddNumbers(bf);
		printNameOfContinent("Ukraine");
		
		Product.nameQuantityOfExpenciveProduct();
		Product.biggestQuantityOfItem();
	}
	
	public static void countNumberOfOddNumbers(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter the count of numbers: ");
		int couunt = Integer.parseInt(br.readLine());		
		int oddCount = 0;
		for (int i = 0; i < couunt; i++) {
			System.out.println("Enter the number:");
			int number = Integer.parseInt(br.readLine());
			if (number % 2 == 0) {
				oddCount++;
			}
		}
		System.out.println("The count of odd: " + oddCount);		
		
	}
	
	public static void nameOfWeekDay (int numberOfDay) {
		switch (numberOfDay) {
		case 1:
			System.out.println("Monday, Понеділок, Lundi");
			break;
		case 2:
			System.out.println("Tuesday, Вівторок, Mardi");
			break;
		case 3:
			System.out.println("Wednesday, Середа, Mercredi");
			break;
		case 4:
			System.out.println("Thursday, Четвер, Jeudi");
			break;
		case 5:
			System.out.println("Friday, П'ятниця, Vendredi");
			break;
		case 6:
			System.out.println("Saturday, Субота, Samedi");
			break;
		case 7:
			System.out.println("Sanday, Неділя, Dimanche");
		default:
			System.out.println("Week has seven days");
			break;
		}
	}
	
	public static void printNameOfContinent(String contry) {
		continent = null;
		switch (contry) {
		case "Ukraine":
		case "Poland":
		case "France":
			continent = Continent.EURASIA;			
			break;
		case "USA":
		case "Canada":
		case "Mexico":
			continent = Continent.NORSH_AMERICA;
			break;
		case "Brasil":
		case "Urugway":
		case "Paragway":
			continent = Continent.SOUCH_AMERICA;
			break;
		case "Egypt":
		case "Kongo":
		case "Tunis":
			continent = Continent.AFRICA;
			break;
		case "Australia":
			continent = Continent.AUSTRALIA;
			break;
		default:
			continent = Continent.ANTARKTIDA;
			break;
		}
		System.out.println(continent);
	}
	
	
}

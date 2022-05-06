
import java.util.Scanner;

public class nameCountryOfContinents {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the name of country");
        String nameOfCountry = sc.nextLine();
        Continent continent;
        switch (nameOfCountry.toUpperCase()) {
            case "UKRAINE":
                System.out.println(continent = Continent.EURASIA);
                break;
            case "FRANCE":
                System.out.println(continent = Continent.EURASIA);
                break;
            case "USA":
                System.out.println(continent = Continent.NORTH_AMERICA);
                break;
            case "BRASIL":
                System.out.println(continent = Continent.SOUTH_AMERICA);
                break;
            case "Kongo":
                System.out.println(continent = Continent.AFRICA);
                break;
            case "AUSTRALIA":
                System.out.println(continent = Continent.AUSTRALIA);
                break;
            default:
                System.out.println("Enter another country. This is only a test program.");
        }

    }
}

enum Continent {
    EURASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA
}


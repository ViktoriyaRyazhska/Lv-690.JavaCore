package project;

import java.util.Scanner;

/**
 * The coffee machine has the following features:
 * 1. water tank 2000 ml maximum
 * 2. milk container 800 ml
 * 3. container for coffee beans 250 g
 * 4. container for disposable cups 10 pcs
 * <p>
 * The coffee machine has the following features:
 * 1. Brew and sell 3 types of coffee:
 * -espresso
 * -latte
 * -cappuccino
 * * 2. Be filled with ingredients with a limit on the maximum capacity of the coffee machine
 * 3. Give out money for sold coffee
 * <p>
 * For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
 * For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
 * For the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        StepsNecessary stepsNecessary = new StepsNecessary();
        while (isContinue) {
            stepsNecessary.standardInput(scanner);
            System.out.println("Do yuo want to exit? (yes or no)");
            String answer = scanner.nextLine();
            System.out.println("===============================");
            if (answer.toLowerCase().equals("yes")) {
                isContinue = false;
            }
        }
        System.out.println("Good buy!");
    }
}

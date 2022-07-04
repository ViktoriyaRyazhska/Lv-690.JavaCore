package project;

import java.util.Scanner;

/**
 * This class describes the methods for filling the coffee machine:
 * The method accepts the user's request to fill the coffee machine with water.
 * The method accepts the user's request to fill the coffee machine with milk.
 * The method accepts the user's request to fill the coffee machine with coffee beans.
 * The method accepts the user's request to fill the coffee machine with disposable cups.
 */
public class FillCoffeeMachina extends Fill {
    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;

    /**
     * The method accepts the user's request to fill the coffee machine with water.
     *
     * @param scanner
     */

    public void fillWater(Scanner scanner) {
        int maxWater = 2000;
        System.out.println("Write how many ml of water you want to add (max 2000ml): ");
        int newWater = scanner.nextInt();
        while (newWater > maxWater) {
            System.out.println("Error! Write how many ml of water you want to add (max 2000ml): ");
            newWater = scanner.nextInt();
        }
        water = newWater;
    }

    /**
     * The method accepts the user's request to fill the coffee machine with milk.
     *
     * @param scanner
     */

    public void fillMilk(Scanner scanner) {
        int maxMilk = 800;
        System.out.println("Write how many ml of milk you want to add (max 800ml): ");
        int newMilk = scanner.nextInt();
        while (newMilk > maxMilk) {
            System.out.println("Error! Write how many ml of milk you want to add (max 800ml): ");
            newMilk = scanner.nextInt();
        }
        milk = newMilk;
    }

    /**
     * The method accepts the user's request to fill the coffee machine with coffee beans.
     *
     * @param scanner
     */
    public void fillCoffeeBeans(Scanner scanner) {
        int maxCoffeeBeans = 250;
        System.out.println("Write how many grams of coffee beans you want to add (max 250g): ");
        int newCoffeeBeans = scanner.nextInt();
        while (newCoffeeBeans > maxCoffeeBeans) {
            System.out.println("Error! Write how many g of coffee beans you want to add (max 250g): ");
            newCoffeeBeans = scanner.nextInt();
        }
        coffeeBeans = newCoffeeBeans;
    }

    /**
     * The method accepts the user's request to fill the coffee machine with disposable cups.
     *
     * @param scanner
     */
    public void fillDisposableCups(Scanner scanner) {
        int maxDisposableCups = 10;
        System.out.println("Write how many disposable cups of coffee you want to add (max 10): ");
        int newDisposableCups = scanner.nextInt();
        while (newDisposableCups > maxDisposableCups) {
            System.out.println("Error! Write how many disposable cups of coffee you want to add (max 10): ");
            newDisposableCups = scanner.nextInt();
        }
        disposableCups = newDisposableCups;
    }

    @Override
    int putWater() {
        return water;
    }

    @Override
    int putMilk() {
        return milk;
    }

    @Override
    int putCoffeeBeans() {
        return coffeeBeans;
    }

    @Override
    int putDisposableCups() {
        return disposableCups;
    }
}

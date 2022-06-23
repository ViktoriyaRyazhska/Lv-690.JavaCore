package project;

import java.util.Scanner;

public class FillCoffeeMachina extends Fill {
    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;

    /**
     * The method accepts the user's request to fill the coffee machine with ingredients.
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

    public void fillDisposableCups(Scanner scanner) {
        int maxDisposableCups = 10;
        System.out.println("Write how many disposable cups of coffee you want to add (max 10): ");
        int newDisposableCups = scanner.nextInt();
        while (newDisposableCups > maxDisposableCups) {
            System.out.println("Error! Write how many disposable cups of coffee you want to add (max 10): ");
            newDisposableCups = scanner.nextInt();
        }
        disposableCups=newDisposableCups;
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

    @Override
    void calculate() {

    }

}

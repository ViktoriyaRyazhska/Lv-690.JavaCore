package project;

import java.util.Scanner;

/**
 * In this class, the initial number of ingredients and their maximum values are set.
 * This class uses the following methods:
 * The method shows the amount of products in the coffee machine.
 * The method that counts the amount of stock after making coffee.
 * The method considers: is it possible to make coffee from the available ingredients.
 * The method allows you to calculate how many ingredients can be added to the coffee machine.
 * The method allows you to see how much money you have and give it out.
 */
public class CoffeeMachine {
    private int water = 600;
    private int milk = 600;
    private int coffeeBeans = 200;
    private int disposableCups = 5;
    private int money = 550;
    private final int maxWater = 2000;
    private final int maxMilk = 800;
    private final int maxCoffeeBeans = 250;
    private final int maxDisposableCups = 10;

    /**
     * The method shows the amount of products in the coffee machine.
     */
    public void show() {

        System.out.println("The coffee machine has: \n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans\n" +
                disposableCups + " disposable cups\n" +
                "$" + money + " of money");
    }

    /**
     * The method that counts the amount of stock after making coffee.
     *
     * @param coffee
     */
    public void makeСoffee(Coffee coffee) {
        if (ifPossibleMakeСoffee(coffee)) {
            coffee.showProgress();
            water = water - coffee.getWater();
            milk = milk - coffee.getMilk();
            coffeeBeans = coffeeBeans - coffee.getCoffeeBeans();
            disposableCups = disposableCups - 1;
            money = money + coffee.getCost();
        } else {
            System.out.println("Fill the coffee machine!");
        }
    }

    /**
     * The method considers: is it possible to make coffee from the available ingredients.
     *
     * @param coffee
     * @return
     */
    public boolean ifPossibleMakeСoffee(Coffee coffee) {

        if (water - coffee.getWater() < 0) {
            return false;
        }
        if (milk - coffee.getMilk() < 0) {
            return false;
        }
        if (coffeeBeans - coffee.getCoffeeBeans() < 0) {
            return false;
        }
        if (disposableCups - 1 < 0) {
            return false;
        }
        return true;
    }

    /**
     * The method allows you to calculate how much water can be added to the coffee machine.
     *
     * @param fill
     */
    public void calculateWater(Fill fill) {
        calculate(water, maxWater, fill.putWater(), "ml");
    }

    /**
     * The method allows you to calculate how much milk can be added to the coffee machine.
     *
     * @param fill
     */
    public void calculateMilk(Fill fill) {
        calculate(milk, maxMilk, fill.putMilk(), "ml");
    }

    /**
     * The method allows you to calculate how much coffee beans can be added to the coffee machine.
     *
     * @param fill
     */
    public void calculateCoffeeBeans(Fill fill) {
        calculate(coffeeBeans, maxCoffeeBeans, fill.putCoffeeBeans(), "g");
    }

    /**
     * The method allows you to calculate how much disposable cups can be added to the coffee machine.
     *
     * @param fill
     */
    public void calculateDisposableCups(Fill fill) {
        calculate(disposableCups, maxDisposableCups, fill.putDisposableCups(), "");
    }

    /**
     * The method allows you to calculate how many ingredients can be added to the coffee machine.
     *
     * @param currentValue
     * @param maxValue
     * @param newValue
     * @param units
     */
    public void calculate(int currentValue, int maxValue, int newValue, String units) {
        if ((currentValue + newValue) <= maxValue) {
            System.out.println("Yes, You can fill " + newValue + units);
            currentValue = currentValue + newValue;
        } else if ((currentValue + newValue) > maxValue) {
            System.out.println("No, You can fill only " + (maxValue - currentValue) + units);
            currentValue = maxValue;
        }
    }

    /**
     * The method allows you to see how much money you have and give it out.
     */
    public void takeMoney(Scanner scanner) {
        System.out.println("I gave you $" + money);
        System.out.println("Yes or No?");
        String actionChoice = scanner.nextLine();
        switch (actionChoice.toLowerCase()) {
            case ("yes"):
                money = 0;
                System.out.println("Take your money!");
                System.out.println();
                break;
            case ("no"):
                System.out.println("Have a good day!");
                break;
            default:
                System.out.println("error!");
        }
    }
}




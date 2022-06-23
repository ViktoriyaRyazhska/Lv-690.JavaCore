package project;

import java.util.Scanner;

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
     * the method shows the amount of products in the coffee machine
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
     * the method that counts the amount of stock after making coffee
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
     * the method shows the amount of stock in the coffee machine after filling
     *
     * @param fill
     */


    public void calculateWater(Fill fill) {
        calculate(water, maxWater, fill.putWater(), "ml");
    }

    public void calculateMilk(Fill fill) {
        calculate(milk, maxMilk, fill.putMilk(), "ml");
    }

    public void calculateCoffeeBeans(Fill fill) {
        calculate(coffeeBeans, maxCoffeeBeans, fill.putCoffeeBeans(), "g");
    }

    public void calculateDisposableCups(Fill fill) {
        calculate(disposableCups, maxDisposableCups, fill.putDisposableCups(), "");
    }

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
     * the method allows you to see how much money you have and give it out
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




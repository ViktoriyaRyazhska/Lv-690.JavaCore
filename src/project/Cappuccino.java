package project;

import static java.lang.Thread.sleep;

/**
 * And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
 * Class Cappuccino making cappuccino and show progress.
 */

public class Cappuccino extends Coffee {
    int water = 200;
    int milk = 100;
    int coffeeBeans = 12;
    int cost = 6;

    @Override
    int getWater() {
        return water;
    }

    @Override
    int getMilk() {
        return milk;
    }

    @Override
    int getCoffeeBeans() {
        return coffeeBeans;
    }

    @Override
    int getCost() {
        return cost;
    }

    @Override
    String getName() {
        return "cappuccino";
    }

    @Override
    void showProgress() {
        System.out.println("Starting to make a coffee");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mixing boiled water with crushed coffee beans");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Coffee is ready!");
        System.out.println();
    }
}



package project;

import static java.lang.Thread.sleep;

/**
 * For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
 */

public class Latte extends Coffee {
    int water = 350;
    int milk = 75;
    int coffeeBeans = 20;
    int cost = 7;

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
        return "latte";
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





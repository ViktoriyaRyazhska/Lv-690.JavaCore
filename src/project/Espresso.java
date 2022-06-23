package project;

import static java.lang.Thread.sleep;

/**
 * For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
 */

public class Espresso extends Coffee {
    int water = 250;
    int coffeeBeans = 16;
    int cost = 4;

    @Override
    int getWater() {
        return water;
    }

    @Override
    int getMilk() {
        return 0;
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
        return "espresso";
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
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Coffee is ready!");
        System.out.println();
    }

    }



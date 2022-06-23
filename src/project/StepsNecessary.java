package project;

import java.util.Scanner;

public class StepsNecessary extends Thread {
    CoffeeMachine coffeeMachine = new CoffeeMachine();


    /**
     * program that offers to buy one cup of coffee, to fill up the ingredients, or to take its money.
     * At the same time, the program should calculate how many ingredients it has left.
     * And also display the number of ingredients before and after purchase.
     *
     * @param scanner
     */
    public void standardInput(Scanner scanner) {
        coffeeMachine.show();
        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.nextLine();

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? (1-espresso, 2-latte, 3-cappuccino)");
                int chose = scanner.nextInt();
                buy(chose);
                coffeeMachine.show();
                scanner.nextLine();
                break;
            case "fill":
                FillCoffeeMachina fillCoffeeMachina = new FillCoffeeMachina();
                fillCoffeeMachina.fillWater(scanner);
                coffeeMachine.calculateWater(fillCoffeeMachina);

                fillCoffeeMachina.fillMilk(scanner);
                coffeeMachine.calculateMilk(fillCoffeeMachina);

                fillCoffeeMachina.fillCoffeeBeans(scanner);
                coffeeMachine.calculateCoffeeBeans(fillCoffeeMachina);

                fillCoffeeMachina.fillDisposableCups(scanner);
                coffeeMachine.calculateDisposableCups(fillCoffeeMachina);

                coffeeMachine.show();
                scanner.nextLine();
                break;
            case "take":
                coffeeMachine.takeMoney(scanner);
                coffeeMachine.show();
                System.out.println();
                break;
            default:
                System.out.println("error!");
        }
    }

    private void buy(int chose) {
        Coffee coffee = null;
        switch (chose) {
            case 1:
                coffee = new Espresso();
                break;
            case 2:
                coffee = new Latte();
                break;
            case 3:
                coffee = new Cappuccino();
                break;
            default:
                System.out.println("error!");
        }
        if (coffee != null) {
            System.out.println(coffee.getName());
            System.out.println();
            coffeeMachine.makeСoffee(coffee);
        }
    }
}



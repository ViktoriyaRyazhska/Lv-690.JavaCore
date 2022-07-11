package com.softserve.javacore;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeMachine {
    private int money;
    private int water;
    private int milk;
    private int coffee;
    private int cups;
    private MenuAction action;

    private static final int WATER_MAX_CAPACITY = 3000;
    private static final int MILK_MAX_CAPACITY = 1500;
    private static final int COFFEE_MAX_CAPACITY = 1000;
    private static final int CUPS_MAX_CAPACITY = 100;


    public CoffeeMachine() {
        this.money = 550;
        this.water = 500;
        this.milk = 400;
        this.coffee = 120;
        this.cups = 3;
        this.action = MenuAction.REPORT;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void run() {

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter command (buy, fill, take, report, exit):");
            try {
                action = MenuAction.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
                switch (action) {
                    case BUY:
                        buy();
                        break;
                    case FILL:
                        fill();
                        break;
                    case TAKE:
                        take();
                        break;
                    case REPORT:
                        report();
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getClass().getSimpleName() + " : " + ex.getMessage());
                System.out.println("Please enter valid command");
            }

        } while (action != MenuAction.EXIT);
        System.out.println("Have a good day!");

    }

    public void report() {
        System.out.println();
        System.out.println("********************************");
        System.out.println("The coffee machine has:");
        System.out.println(String.format("%d ml of water", this.water));
        System.out.println(String.format("%d ml of milk", this.milk));
        System.out.println(String.format("%d g of coffee beans", this.coffee));
        System.out.println(String.format("%d disposable cups", this.cups));
        System.out.println(String.format("$%d of money", this.money));
        System.out.println("********************************");
        System.out.println();
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        water = Math.min(water + scanner.nextInt(), WATER_MAX_CAPACITY);
        System.out.println("Write how many ml of milk you want to add:");
        milk = Math.min(milk + scanner.nextInt(), MILK_MAX_CAPACITY);
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffee = Math.min(coffee + scanner.nextInt(), COFFEE_MAX_CAPACITY);
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups = Math.min(cups + scanner.nextInt(), CUPS_MAX_CAPACITY);
        report();
    }

    private void take() {
        System.out.println(String.format("I gave you $%d", this.money));
        this.money = 0;
        report();
    }

    private void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1": {
                makeCoffee(new Espresso());
                break;
            }

            case "2": {
                makeCoffee(new Latte());
                break;
            }

            case "3": {
                makeCoffee(new Cappuccino());
                break;
            }

            case "back": {
                break;
            }

        }

    }

    public void makeCoffee(Coffee coffee) {
        if (enoughIngridients(coffee)) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println(coffee);
            this.water -= coffee.getWaterPerCup();
            this.coffee -= coffee.getCoffeePerCup();
            this.milk -= coffee.getMilkPerCup();
            this.cups -= 1;
            this.money += coffee.getMoneyPerCup();
            report();
        }

    }

    public boolean enoughIngridients(Coffee coffee) {
        if (this.water < coffee.waterPerCup) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (this.coffee < coffee.getCoffeePerCup()) {
            System.out.println("Sorry, not enough coffee!");
            return false;
        }
        if (this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
            return false;
        }
        if (this.milk < coffee.getMilkPerCup()) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "money=" + money +
                ", water=" + water +
                ", milk=" + milk +
                ", coffee=" + coffee +
                ", cups=" + cups +
                '}';
    }
}

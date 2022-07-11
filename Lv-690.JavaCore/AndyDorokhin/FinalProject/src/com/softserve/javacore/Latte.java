package com.softserve.javacore;

public class Latte extends Coffee{

    public Latte() {
        this.waterPerCup = 200;
        this.coffeePerCup = 20;
        this.milkPerCup = 75;
        this.moneyPerCup = 7;
    }

    @Override
    public String toString() {
        return "Latte{" +
                "waterPerCup=" + waterPerCup +
                ", coffeePerCup=" + coffeePerCup +
                ", milkPerCup=" + milkPerCup +
                ", moneyPerCup=" + moneyPerCup +
                '}';
    }
}

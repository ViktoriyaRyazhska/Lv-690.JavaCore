package com.softserve.javacore;

public class Cappuccino extends Coffee{

    public Cappuccino() {
        this.waterPerCup = 250;
        this.coffeePerCup = 12;
        this.milkPerCup = 100;
        this.moneyPerCup = 6;
    }

    @Override
    public String toString() {
        return "Cappuccino{" +
                "waterPerCup=" + waterPerCup +
                ", coffeePerCup=" + coffeePerCup +
                ", milkPerCup=" + milkPerCup +
                ", moneyPerCup=" + moneyPerCup +
                '}';
    }
}

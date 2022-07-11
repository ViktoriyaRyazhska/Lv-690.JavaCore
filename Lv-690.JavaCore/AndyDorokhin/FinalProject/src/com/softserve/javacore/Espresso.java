package com.softserve.javacore;

public class Espresso extends Coffee{

    public Espresso() {
        this.waterPerCup = 100;
        this.coffeePerCup = 16;
        this.milkPerCup = 0;
        this.moneyPerCup = 4;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "waterPerCup=" + waterPerCup +
                ", coffeePerCup=" + coffeePerCup +
                ", milkPerCup=" + milkPerCup +
                ", moneyPerCup=" + moneyPerCup +
                '}';
    }
}

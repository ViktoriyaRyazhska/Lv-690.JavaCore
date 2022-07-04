package project;

/**
 * Abstract class that contains basic methods for different ingredients to brew abstract coffee and show progress.
 */

public abstract class Coffee {


    abstract int getWater();

    abstract int getMilk();

    abstract int getCoffeeBeans();

    abstract int getCost();

    abstract String getName();

    abstract void showProgress();

}

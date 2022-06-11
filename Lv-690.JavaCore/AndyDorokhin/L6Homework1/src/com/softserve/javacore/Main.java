package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Eagle bird1 = new Eagle("white", 1, 3000);
        Swallow bird2 = new Swallow("grey", 5, 450);
        Penguin bird3 = new Penguin("black-and-white", 1, false);
        Chicken bird4 = new Chicken("white", 10, true);

        Bird[] birds = {bird1, bird2, bird3, bird4};
        for (Bird bird: birds) {
            System.out.println(bird.getClass().toString());
            bird.fly();
        }
    }

}

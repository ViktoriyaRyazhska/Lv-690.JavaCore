package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle v1 = new Liner(500, 3);
        Vehicle v2 = new Boat(4, 500);
        Vehicle v3 = new Plane(300, 1500);
        Vehicle v4 = new Helicopter(15, 5000, 3000);
        Vehicle v5 = new Bus(80, "Lviv - Uzhhorod");
        Vehicle v6 = new Motorcycle(2, 225);
        Vehicle v7 = new Car(5, "Subaru XV");

        Vehicle[] vehicles = {v1, v2, v3, v4, v5, v6, v7};
        for (Vehicle v : vehicles) {
            System.out.println(v);
            v.run();
        }

    }
}

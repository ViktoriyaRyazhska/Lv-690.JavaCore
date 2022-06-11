package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {

        Truck car1 = new Truck("Ford F150", 160, 2020, CabinType.CREW, true, 3000);
        Sedan car2 = new Sedan("Toyota Camry", 210, 2022, 600, false);
        Truck car3 = new Truck("Chevrolet Silverado", 180, 2021, CabinType.EXTENDED, false, 2000);

        Car[] cars = {car1, car2, car3};
        for (Car car : cars) {
            System.out.println(car);
            car.run();
            car.stop();

        }
    }


}

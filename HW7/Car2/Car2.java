package Practice.Car2;

import java.time.LocalDate;

public class Car2 {
    private String model;
    private LocalDate dateOfProduction;
    private double enginCapacity;
    private String color = "";
    private int passengerCapacity;

    private Car2() {

    }


    public String toString() {
        return ("Car model :" + model +
                " Date Of Production :" + dateOfProduction +
                " Engin Capacity :" + enginCapacity +
                " Color :" + color +
                " Passenger Capacity :" + passengerCapacity);

    }

    public static CarBuilder getCar() {
        return new Car2().new CarBuilder();
    }


    public class CarBuilder {
        Car2 car;

        public CarBuilder() {
            car = new Car2();
        }

        public CarBuilder addModel(String mod) {
            car.model = mod;
            return this;
        }

        public CarBuilder addDateOfProduction(LocalDate dateOfProd) {
            car.dateOfProduction = dateOfProd;
            return this;
        }

        public CarBuilder addEnginCapacity(double enginCap) {
            car.enginCapacity = enginCap;
            return this;
        }

        public CarBuilder addColor(String colorAdd) {
            car.color += colorAdd;
            return this;
        }

        public CarBuilder addPassengerCapacity(int pasAdd) {
            car.passengerCapacity = pasAdd;
            return this;
        }

        public Car2 build() {

            return car;

        }

    }

}

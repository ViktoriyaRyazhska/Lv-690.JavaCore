package com.company;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dataOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car() {
    }

    public static CarBuilder getCar() {
        return
                new Car().new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dataOfProduction=" + dataOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }


    public class CarBuilder {
        Car c = new Car();

        public CarBuilder() {

        }

        public CarBuilder addModel(String model1) {
            c.model = model1;
            return this;
        }

        public CarBuilder addColor(String color) {
            c.color = color;
            return this;
        }

        public CarBuilder addDataOfProduction(LocalDate dataOfProduction) {
            c.dataOfProduction = dataOfProduction;
            return this;
        }

        public CarBuilder addEngineOfCapacity(double engineCapacity) {
            c.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder addPassengerCapacity(int passengerCapacity) {
            c.passengerCapacity = passengerCapacity;
            return this;
        }

        public CarBuilder setisAirConditioning(boolean isAirConditioning) {
            c.isAirConditioning = isAirConditioning;
            return this;
        }

        public Car build() {
            return c;
        }


    }
}



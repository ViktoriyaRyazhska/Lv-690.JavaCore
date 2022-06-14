package com.softserve.javacore;

import java.time.LocalDate;

public class Car {
    private final String model;
    private final LocalDate dateOfProduction;
    private final double engineCapacity;
    private final String color;
    private final int passengerCapacity;
    private final boolean isAirConditioning;

    public static class CarBuilder {
        private String model;
        private LocalDate dateOfProduction;
        private double engineCapacity;
        private String color;
        private int passengerCapacity;
        private boolean isAirConditioning;

        public CarBuilder() {

        }

        public Car build() {
            return new Car(this);
        }

        public CarBuilder addModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
            this.dateOfProduction = dateOfProduction;
            return this;
        }

        public CarBuilder addEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder addColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder addPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public CarBuilder setIsAirConditioning(boolean isAirConditioning) {
            this.isAirConditioning = isAirConditioning;
            return this;
        }
    }

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.dateOfProduction = builder.dateOfProduction;
        this.engineCapacity = builder.engineCapacity;
        this.color = builder.color;
        this.passengerCapacity = builder.passengerCapacity;
        this.isAirConditioning = builder.isAirConditioning;
    }

    /*
    public String getModel() {
        return model;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public boolean isAirConditioning() {
        return isAirConditioning;
    }
    */

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }
}


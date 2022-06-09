package com.softserve.javacore;

public class Car implements Comparable<Car>{
    private CarType type;
    private int productionYear;
    private int engineCapacity;

    public Car() {};

    public Car(CarType type, int productionYear, int engineCapacity) {
        this.type = type;
        this.productionYear = productionYear;
        this.engineCapacity = engineCapacity;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (productionYear != car.productionYear) return false;
        if (engineCapacity != car.engineCapacity) return false;
        return type == car.type;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + productionYear;
        result = 31 * result + engineCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", productionYear=" + productionYear +
                ", engineCapacity=" + engineCapacity +
                '}';
    }


    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.getProductionYear(), o.getProductionYear());
    }

    public static void listByYear(int year, Car[] cars) {
        int count = 0;
        System.out.println("Listing cars for production year " + year);
        for (Car car : cars) {
            if (car.getProductionYear() == year) {
                System.out.println(car);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No cars fount for year " + year);
        }
    }

}


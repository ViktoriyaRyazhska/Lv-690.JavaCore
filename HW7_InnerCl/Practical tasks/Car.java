package HW7_InnerClasses;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private int passengers;
    private String color;


    public static void main(String[] args) {
        Car car = Car.getCar().addModel("Audi").addPassengers(5).addColor("grey").addDateOfProduction(LocalDate.of(2021,5,15)).build();
        System.out.println(car);
    }

    private Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", passengers=" + passengers +
                ", color='" + color + '\'' +
                '}';
    }

    public static CarBuilder getCar(){
        return new Car().new CarBuilder();
    }

    public class CarBuilder{
        Car car;
        private CarBuilder() {
            car = new Car();
        }

        public CarBuilder addDateOfProduction(LocalDate date){
        car.dateOfProduction=date;
        return this;
        }
        public CarBuilder addModel(String addModel){
            car.model=addModel;
            return this;
        }
        public CarBuilder addPassengers(int passengers){
            car.passengers=passengers;
            return this;
        }
        public CarBuilder addColor(String addColor){
            car.color=addColor;
            return this;
        }
    public Car build(){
        return car;
    }
    }
}

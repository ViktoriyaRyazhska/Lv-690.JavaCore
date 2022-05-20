package Practice.Car2;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Car2 car = Car2.getCar().
                addColor("Red").
                addModel("Toyota").
                addEnginCapacity(2.3).
                addDateOfProduction(LocalDate.ofYearDay(2006,3)).
                addPassengerCapacity(5).
                build();


        System.out.println(car);




    }
}

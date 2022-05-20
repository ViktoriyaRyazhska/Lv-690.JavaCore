package PractTask1_anotherVariant;

import java.time.LocalDate;

public class CarsAppl {
    public static void main(String[] args) {
        Cars car=Cars.getCars().
                addColor("Black").
                addModel("Mercedes").
                addPassangerCapasity(4).
                addEngineCapasity(3).
                addDataOfProduction(LocalDate.now()).
                addIsAirConditioning(true).
                buid();

        Cars car1=Cars.getCars().
                addColor("White").
                addModel("Toyota").
                addPassangerCapasity(3).
                addEngineCapasity(2).
                addDataOfProduction(LocalDate.now()).
                addIsAirConditioning(true).
                buid();

        System.out.println(car);
        System.out.println(car1);
    }
}

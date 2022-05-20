package PractTask1_anotherVariant;

import java.time.LocalDate;

public class Cars {
    private String model;
    private LocalDate dataOfProduction;
    private double engineCapasity;
    private String color;
    private int passangerCapasity;
    private boolean  isAirConditioning;
    private Cars(){

    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", dataOfProduction=" + dataOfProduction +
                ", engineCapasity=" + engineCapasity +
                ", color='" + color + '\'' +
                ", passangerCapasity=" + passangerCapasity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }

    public static CarsBuilder getCars(){
        return new Cars().new CarsBuilder();
    }

    public class CarsBuilder{
        Cars car;
        public CarsBuilder(){
            car=new Cars();
        }
        public CarsBuilder addModel(String model){
            car.model=model;
            return this;
        }
        public CarsBuilder addDataOfProduction(LocalDate dataOfProduction){
            car.dataOfProduction=dataOfProduction;
            return this;
        }
        public CarsBuilder addEngineCapasity(double engineCapasity){
            car.engineCapasity=engineCapasity;
            return this;
        }
        public CarsBuilder addColor(String color){
            car.color=color;
            return this;
        }
        public CarsBuilder addPassangerCapasity(int passangerCapasity){
            car.passangerCapasity=passangerCapasity;
            return this;
        }
        public CarsBuilder addIsAirConditioning(boolean isAirConditioning){
            car.isAirConditioning=isAirConditioning;
            return this;
        }
public Cars buid(){
            return car;
}
    }
}

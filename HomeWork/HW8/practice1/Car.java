package HW8.practice1;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dataOfProduction;
    private double engineCapasity;
    private String color;
    private int passangerCapasity;
    private boolean  isAirConditioning;

    public static class CarBuilder {
        private String addModel;
        private String addColor;
        private LocalDate addDataOfProduction;
        private double addEngineCapasity;
        private int addPassangerCapasity;
        boolean setisAirConditioning;

        public String getAddModel() {
            return addModel;
        }

        public void setAddModel(String addModel) {
            this.addModel = addModel;
        }

        public String getAddColor() {
            return addColor;
        }

        public void setAddColor(String addColor) {
            this.addColor = addColor;
        }

        public LocalDate getAddDataOfProduction() {
            return addDataOfProduction;
        }

        public void setAddDataOfProduction(LocalDate addDataOfProduction) {
            this.addDataOfProduction = addDataOfProduction;
        }

        public double getAddEngineCapasity() {
            return addEngineCapasity;
        }

        public void setAddEngineCapasity(double addEngineCapasity) {
            this.addEngineCapasity = addEngineCapasity;
        }

        public int getAddPassangerCapasity() {
            return addPassangerCapasity;
        }

        public void setAddPassangerCapasity(int addPassangerCapasity) {
            this.addPassangerCapasity = addPassangerCapasity;
        }

        public boolean isSetisAirConditioning() {
            return setisAirConditioning;
        }

        public void setSetisAirConditioning(boolean setisAirConditioning) {
            this.setisAirConditioning = setisAirConditioning;
        }

        public CarBuilder(String addModel, String addColor, double addEngineCapasity, int addPassangerCapasity, boolean setisAirConditioning ) {
            this.addModel = addModel;
            this.addColor = addColor;
            this.addEngineCapasity = addEngineCapasity;
            this.addPassangerCapasity = addPassangerCapasity;
            this.setisAirConditioning = setisAirConditioning;
        }
        public void info(){
            System.out.println("Model:  "+addModel+"\nColor: "+addColor+"\nEngineCapasity: "+addEngineCapasity+"\nPassangerCapasity: "+addPassangerCapasity +"\nsetisAirConditioning: "+setisAirConditioning);
        }
    }

    public static void main(String[] args) {
        Car.CarBuilder car=new CarBuilder("Skoda","Black",1000,4, true);
//        car.setAddColor("White");
//        car.setAddModel("BMW");
        
        car.info();
    }
}
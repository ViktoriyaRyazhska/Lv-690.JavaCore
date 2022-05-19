package HW5;

    public class Truck extends Cars{

        public void run(){
            System.out.println("Truck is running");
        }

        public void stop(){
            System.out.println("Truck stopped");
        }

        public Truck(String model, int maxSpeed, int yearOfManufacture){
            super (model, maxSpeed, yearOfManufacture);
        }


}

package HW6_OOP2;

public abstract class Passengers {
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public static void run(Passengers[] vehicles){

        for (Passengers vehicle : vehicles) {
            if (vehicle instanceof WaterVehicle){
                ((WaterVehicle) vehicle).isSailing();
            }
            if (vehicle instanceof FlyingVehicle){
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            }
            if (vehicle instanceof GroundVehicle){
                ((GroundVehicle) vehicle).drive();
            }
        }
    }
}

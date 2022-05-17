package HomeWork.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Passengers> transport = new ArrayList<Passengers>();

        transport.add(new Plane(23, 1200));
        transport.add(new Helicopter(5, 500, 520));
        transport.add(new Liner(200, 4));
        transport.add(new Boat(6, 96));
        transport.add(new Bus(30, "E-23"));
        transport.add(new Motorcycle(2, 180));
        transport.add(new Car(4, "BMW"));

        for (Passengers t : transport) {

            t.getInfo();

            if (t instanceof FlyingVehicle) {
                ((FlyingVehicle) t).fly();
            }
            if (t instanceof WaterVehicle) {
                ((WaterVehicle) t).isSailing();
            }
            if (t instanceof GroundVehicle) {
                ((GroundVehicle) t).drive();
            }
        }


    }
}

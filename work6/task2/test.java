package work6.task2;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Passengers> vehicle = new ArrayList<Passengers>();

		
		vehicle.add(new Liner(156, 3));
		vehicle.add(new Boat(4, 54));
		vehicle.add(new Plane(110, 2000));
		vehicle.add(new Helicopter(6, 60, 500));
		vehicle.add(new Bus(35, "Bohdan"));
		vehicle.add(new Motorcycle(2, 220));
		vehicle.add(new Car(5, "Mercedes"));

		
        for (Passengers i : vehicle) {
            if (i instanceof WaterVehicle) {
                ((WaterVehicle)i).isSailing();
            }
            
            if (i instanceof FlyingVehicle) {
                ((FlyingVehicle)i).fly();
            }
            
            if (i instanceof GroundVehicle) {
                ((GroundVehicle)i).drive();
            }
            i.info();
        }
	}

}

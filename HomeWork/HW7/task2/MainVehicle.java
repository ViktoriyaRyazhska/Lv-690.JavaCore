package HW7.task2;

//2. Develop and test a program’s structure corresponding to the next schema.

import java.util.ArrayList;
import java.util.List;

public class MainVehicle {
  public static void main(String[] args) {
      List<Vehicle> listOfVehicles = new ArrayList<>();
      listOfVehicles.add(new Boat(8, 50));
      listOfVehicles.add(new Bus(30, "LAZ"));
      listOfVehicles.add(new Car(4, "Toyota"));
      listOfVehicles.add(new Helicopter(2, 500, 700));
      listOfVehicles.add(new Liner(100, 3));
      listOfVehicles.add(new Motorcycle(1, 280));
      listOfVehicles.add(new Plane(150, 10000));


      for (Vehicle vehicle : listOfVehicles) {
          System.out.println(vehicle);

          if (vehicle instanceof WaterVehicle) {
              ((WaterVehicle) vehicle).isSailling();
          }
          if (vehicle instanceof GroundVehicle) {
              ((GroundVehicle) vehicle).drive();
          }
          if (vehicle instanceof FlyingVehicle) {
              ((FlyingVehicle) vehicle).fly();
              ((FlyingVehicle) vehicle).land();
          }
      }

  }
}
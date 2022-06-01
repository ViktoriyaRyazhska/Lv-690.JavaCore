package Homework.lesson7.task2;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Passagers[] abc = new Passagers[7];
        abc[0] = new Liner(1400, 15);
        abc[1] = new Boat(8, 15);
        abc[2] = new Plane(186, 12400);
        abc[3] = new Helicopter(2, 6500, 6400);
        abc[4] = new Bus(35, "Khmelnitskyi - Lviv");
        abc[5] = new Motorcycle(2, 250);
        abc[6] = new Car(5, "BMW 328i");

        Arrays.sort(abc, new ComparatorPasaggers());

        for(Passagers elem : abc) {
            System.out.println(elem.getPasagers());
            if(elem instanceof FlyingVehicle){
                ((FlyingVehicle) elem).fly();
                ((FlyingVehicle) elem).land();
            }
            if (elem instanceof WaterVehicle) {
                ((WaterVehicle) elem).isSailing();
            }
            if (elem instanceof GroundVehicle) {
                ((GroundVehicle) elem).drive();
            }
            System.out.println(elem.toString());
    }

}
}

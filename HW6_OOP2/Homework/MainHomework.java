package HW6_OOP2;

import java.util.Arrays;

public class MainHomework {

    public static void main(String[] args) {
        printText("Task 1:");
        Employee[] people = createAndSortPeople();
        Employee.printInfoEmployees(people);
        printText("Task 2:");
        Passengers[] vehicles = createVehicles();
        Passengers.run(vehicles);
    }
    public static void printText(String text){
        System.out.println(text);
    }
    public static Employee[] createAndSortPeople(){

        Employee[] people = new Employee[4];

        people[0] = new SalariedEmployee("000","AC/DC-123",50000);
        people[1] = new ContractEmployee("111","DP-456",176,500);
        people[2] = new SalariedEmployee("222","PF-789",75000);
        people[3] = new ContractEmployee("333","MM-99",170,500);

        Arrays.sort(people);

        return people;
    }
    public static Passengers[] createVehicles(){

        Passengers[] vehicles = new Passengers[7];
        vehicles[0] = new Liner(1000,5);
        vehicles[1] = new Boat(8,800);
        vehicles[2] = new Plane(250,5000);
        vehicles[3] = new Helicopter(12,7500,3000);
        vehicles[4] = new Bus(30,"3A");
        vehicles[5] = new Motorcycle(2,200);
        vehicles[6] = new Car(4,"Audi");

        return vehicles;
    }

}

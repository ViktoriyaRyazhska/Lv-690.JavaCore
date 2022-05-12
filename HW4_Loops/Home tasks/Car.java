package JavaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    public String type;
    public int year;
    public int capacity;

    public Car(String type, int year, int capacity) {
        this.type = type;
        this.year = year;
        this.capacity = capacity;
    }

    public Car() {
    }

    public static void main() throws Exception {

        Car[] cars;
        cars = new Car[4];
        cars[0] = new Car("Ford",1972,4500);
        cars[1] = new Car("Chevrolet",1968,5500);
        cars[2] = new Car("Cadillac",1963,4000);
        cars[3] = new Car("Honda",1990,2500);

        for (Car elemCar: cars) {
                System.out.println(elemCar);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = printWithInput("Enter year of car:_",br);
        compareYears(cars,year);
        sortCars(cars);
    }
    public static void compareYears(Car[] cars, int year){

        boolean bool = false;

        for (Car elemCar: cars) {
            if (elemCar.getYear()==year){
                System.out.println(elemCar.getType()+ " is produced in "+year);
                bool=true;
            }
        }
        if (bool != true){
            System.out.println("none cars are produced in "+year);
        }

    }

    public static void sortCars(Car[] cars){

        Car tmp;

        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() > cars[j].getYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (Car elemCar: cars) {
            System.out.println(elemCar);
        }


    }
    public static int printWithInput(String txt, BufferedReader br)throws IOException {

        System.out.println(txt);
        String str = br.readLine();
        return Integer.parseInt(str);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                '}';
    }
}

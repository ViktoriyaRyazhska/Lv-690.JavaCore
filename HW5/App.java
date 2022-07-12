package HW5;

public class App {
    public static void main (String[] args) {
Car[]car =new Car[3];
car[0]=new Sedan("Opel", 150,2020);
car[1]=new Sedan("BMW",180, 2021);
car[2]=new Truck("Volvo", 140, 2016);
for (int i=0; i<car.length; i++) {
            System.out.println(car[i]);
        }
    }
}

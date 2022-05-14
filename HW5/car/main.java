package practice.car;

public class main {
    public static void main(String[] args) {
        car carA = new truck("Volvo", 2006, 120);
        car carB = new sedan("Toyota", 2012, 180);
        car carC = new sedan("Nisan", 2003, 130);
        car carD = new truck("Ram", 2009, 150);

        car[] cars = {carA, carB, carC, carD};

        printCar(cars);

        carA.run();
        carB.run();
        carC.run();
        carD.run();

    }

    public static void printCar(car[] cars) {
        for (car cr : cars) {
            System.out.println(cr);
        }
    }
}

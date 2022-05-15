package PracticalTask1;

public class main {
    public static void main(String[] args) {
        Car[] car = new Car[4];
        car[0] = new Sedan("Toyota", 200, 2010);
        car[1] = new Sedan("Lexus", 250, 2020);
        car[2] = new Track("Kamaz", 80, 1993);
        car[3] = new Track("Maz", 190, 2014);
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
    }
}

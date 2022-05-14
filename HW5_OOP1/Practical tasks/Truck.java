package JavaCore;

public class Truck extends ACar{

    public Truck(String model, int maxSpeed, int year) {
        super(model, maxSpeed, year);
    }

    public static void main(String[] args) {

        ACar[] cars = new ACar[4];
        cars[0] = new Truck("GM",120,1999);
        cars[1] = new Truck("Ford",160,2005);
        cars[2] = new Sedan("Volvo",220,1999);
        cars[3] = new Sedan("Audi",240,2012);

        for (ACar c:cars){

            System.out.println(c);

        }
    }

}

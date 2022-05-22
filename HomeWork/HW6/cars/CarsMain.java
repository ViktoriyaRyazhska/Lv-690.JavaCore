package HW6.cars;
//1. Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
//Develop classes Truck and Sedan which extend class Car.
//In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it

	import java.util.ArrayList;
	import java.util.List;

	public class CarsMain {

	    public static void main(String[] args) {
	        List<Cars> trucks = new ArrayList<Cars>();
	        trucks.add (new Truck ("Volvo" , 200 , 2009));
	        trucks.add (new Truck("Skoda" , 240 , 2018));
	        trucks.add (new Sedan("BMW" , 280 , 2020));
	        trucks.add (new Sedan("Renault" , 200 , 2012));

	        for (Cars i : trucks){
	            System.out.println(i);
	        }
	    }
	}
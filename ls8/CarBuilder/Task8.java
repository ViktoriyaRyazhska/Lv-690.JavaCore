package ls8.CarBuilder;

import java.time.LocalDate;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

/*
 * Suppose we have the class Car. 
 * Create public inner class CarBuilder inside of Car class correspond to 
 * the next class diagram.
 * Create a car with four different parameters and print info about this car and its parameters
 */

public class Task8 {

	public static void main(String[] args) {
		Car car = Car.getCar()
				.addmodel("BMV")
				.addcolor("Blue")
				.addengineCapacity(6.3)
				.addisAirConditioning(true)
				.addpassengerCapacity(7)
				.adddataOfproduction(LocalDate.of(2018, 02, 28))
				.build();
		System.out.println(car);
		
		Car car1 = Car.getCar().addmodel("Mersedes")
				.addcolor("black")
				.addengineCapacity(6.3)
				.addisAirConditioning(true)
				.addpassengerCapacity(7)
				.adddataOfproduction(LocalDate.now())
				.build();
		
		System.out.println(car1);
		
	
		
	}
	
	

}

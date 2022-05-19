package ls7.Vehicle;

import java.util.Set;
import java.util.TreeSet;

public class Homework_2 {

	public static void main(String[] args) {
		Set<Passengers> set = new TreeSet(Passengers.getPassengersComparator());
		
		set.add(new Liner(100, 3));
		set.add(new Boat(5, 10));
		set.add(new Plane(20, 2000));
		set.add(new Helicopter(6, 1000, 3000));
		set.add(new Bus(300, "Kyiv - New-York"));
		set.add(new Motorcycle(2, 250));
		set.add(new Car(7, "Mersedes"));
		
		for (Passengers passengers : set) {
			System.out.println(passengers);
		}
	}

}

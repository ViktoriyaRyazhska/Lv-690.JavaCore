package ls7.Vehicle;

import java.util.Comparator;

public class Passengers {
	private int passemgers;
	static private PassengersComparator passengersComparator = new PassengersComparator();

	public Passengers(int passemgers) {	
		this.passemgers = passemgers;
	}

	public int getPassemgers() {
		return passemgers;
	}

	public void setPassemgers(int passemgers) {
		this.passemgers = passemgers;
	}
	
	public static PassengersComparator getPassengersComparator() {
		return passengersComparator;
	}

	static class PassengersComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {			
			return ((Passengers)o1).getPassemgers() - ((Passengers)o2).getPassemgers();
		}
		
	}
	
	
}

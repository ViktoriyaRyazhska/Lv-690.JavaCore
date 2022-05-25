package work6.task2;

public abstract class Passengers {
	private int passengers;
	
	public Passengers(int passengers) {
		super();
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public void info(){}
}

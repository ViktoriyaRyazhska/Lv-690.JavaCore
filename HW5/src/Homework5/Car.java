package Homework5;

public class Car implements Comparable<Car> {
	private String type;
	private int year;
	private int capacity;
	public Car(String type, int year, int capacity) {
		this.type = type;
		this.year = year;
		this.capacity = capacity;
	}
	
	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", capacity=" + capacity + "]";
	}

	@Override
    public int compareTo(Car car) {
        return (this.year - car.year);
    }
	
}

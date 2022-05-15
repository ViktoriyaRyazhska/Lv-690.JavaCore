package ls5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Car {
	private String model;
	private int yearOfProduction;
	private double engineCapacity;
	
	public Car(String model, int yearOfProduction, double d) {
		super();
		this.model = model;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = d;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	
	@Override
	public String toString() {
		return "Car [model= " + model + ", yearOfProduction= " + yearOfProduction + ", engineCapacity= " + engineCapacity
				+ "]";
	}

	public static void printCars(ArrayList<Car> cars) {
		for (Car car : cars) {
			System.out.println(car);
		}
	}

	public static <E> void printModelYear(ArrayList<Car> cars, BufferedReader br) throws NumberFormatException, IOException {
		System.out.print("Enter car year: ");
		int carYear = Integer.parseInt(br.readLine());		
		int countCar = 0;
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getYearOfProduction() == carYear) {				
				countCar++;
			}
		}
		if (countCar == 0) {
			System.out.println("Sorry, we don't have cars of this year of production");
		} else {
			System.out.println("There is the next cars: ");
			for (int i = 0; i < cars.size(); i++) {
				if (cars.get(i).getYearOfProduction() == carYear) {
					System.out.println(cars.get(i));				
				}
			}
		}
	}
	
	public static <E> void sortCarByTheYear (ArrayList<Car> cars) {
		Car tmp;		
		for (int i = 0; i < cars.size() - 1; i++) {
			for (int j = i + 1; j < cars.size(); j++) {
				if (cars.get(i).getYearOfProduction() > cars.get(j).getYearOfProduction()) {
					tmp = cars.get(i);
					cars.set(i, cars.get(j));
					cars.set(j, tmp);
				}
			}
		}		
	}
}

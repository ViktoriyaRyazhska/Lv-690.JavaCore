package homework5_practical;

public class Start {
	public static void main(String[] args) {
		Truck truck1 = new Truck();
		Truck truck2 = new Truck();
		Sedan sedan1 = new Sedan();
		Sedan sedan2 = new Sedan();
		Car[] cars=new Car[] {truck1,truck2,sedan1,sedan2};
		for(Car element:cars) {
			element.run();
			element.stop();
		}
	}
}

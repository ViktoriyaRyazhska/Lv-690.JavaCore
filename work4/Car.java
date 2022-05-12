package work4;

import java.time.LocalDate;

public class Car {
	 private String type;
	 private int year;
	 private int capacity;
	 
	 public Car() {}
		public Car(String type, int year, int capacity) {
			this.type = type;
			this.year = year;
			this.capacity = capacity;
		}
		
		
		void setType(String type) {
			this.type = type;
		}
		void setYear(int year) {
			if(year>LocalDate.now().getYear() || year<1800) {
				System.out.println("Error year");
			}else {
				this.year = year;
			}
		}
		void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		
		
		String getType() {
			return type;
		}
		int getYear() {
			return year;
		}
		int getCapacity() {
			return capacity;
		}
		
		static void CarByYear(Car[] car, int year){
			boolean cheack=false;
			for(int i=0;i < car.length;i++) {
				if(car[i].getYear()==year) {
					System.out.println("Type: "+car[i].getType());
					System.out.println("Capacity: "+car[i].getCapacity());
					cheack=true;
					break;
				}
			}
			if(cheack==false) {
				System.out.println("there is no car with such a year");
			}
		}
		
		static void sortCars(Car[] car){
	        Car temp;
	        for (int i = 0; i < car.length - 1; i++) {
	            for (int j = i + 1; j < car.length; j++) {
	                if (car[i].getYear() < car[j].getYear()) {
	                    temp = car[i];
	                    car[i] = car[j];
	                    car[j] = temp;
	                }
	            }
	        }
		}
		
		@Override
	    public String toString() {
	        return "(type is "+type+", year is "+year+" capacity is "+capacity+")";
	    }
}

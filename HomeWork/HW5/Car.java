package HW5;


//4   Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//certain model year  (enter year in the console);
//ordered by the field year.


public class Car {
String name;
int yearOfProduction;
double engine;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getYearOfProduction() {
return yearOfProduction;
}

public void setYearOfProduction(int yearOfProduction) {
this.yearOfProduction = yearOfProduction;
}

public double getEngine() {
return engine;
}

public void setEngine(double engine) {
this.engine = engine;
}

public Car(String name, int yearOfProduction, double engine) {
this.name = name;
this.yearOfProduction = yearOfProduction;
this.engine = engine;
}

@Override
public String toString() {
return "Car{" +
      "name='" + name + '\'' +
      ", yearOfProduction=" + yearOfProduction +
      ", engine=" + engine +
      '}';
}

}
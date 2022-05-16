package homework4;

import java.util.Objects;

public class Car {
	private int year;
	private float eng;
	public Car(int year, float eng) {
		super();
		this.year = year;
		this.eng = eng;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getEng() {
		return eng;
	}
	public void setEng(float eng) {
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "Car: year = "+year+" engine = "+eng;
	}
	@Override
	public int hashCode() {
		return Objects.hash(eng, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Float.floatToIntBits(eng) == Float.floatToIntBits(other.eng) && year == other.year;
	}
	
}

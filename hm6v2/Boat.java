package hm6v2;

public class Boat extends WaterVehicle{
	private int volume;

	public Boat(int passengers, int volume) {
		super(passengers);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
public void isSailing() {
		
	}
}

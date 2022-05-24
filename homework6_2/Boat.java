package homework6_2;

public class Boat extends WaterVehicle{
	private int volume;
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Boat(int volume) {
		super(1);
		this.volume = volume;
	}

	public void isSaling() {
		
	}
	
}

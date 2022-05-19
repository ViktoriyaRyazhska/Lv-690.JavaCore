package ls7.Vehicle;

public class Boat extends WaterVehicle{
	private int volume;

	public Boat(int passemgers, int volume) {
		super(passemgers);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void isSailing() {
		System.out.println("Full forward");
		super.isSailing();
	}

	@Override
	public String toString() {
		return "Boat [volume=" + volume + ", getPassemgers()=" + getPassemgers() + "]";
	}


	

}

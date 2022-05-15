package Homework6;

public class FlyingBird extends Bird {

	public FlyingBird(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public boolean fly() {
		return true;
	}

}

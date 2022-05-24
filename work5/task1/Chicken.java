package work5.task1;

public class Chicken extends NonFlyingBird {

	public Chicken(String[] feathers, int layEggs) {
		super(feathers, layEggs);
		setName("chicken");
	}

	@Override
	public void fly() {
		System.out.println(getName()+" dont flies");

	}

}

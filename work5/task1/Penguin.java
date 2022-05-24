package work5.task1;

public class Penguin extends NonFlyingBird {

	public Penguin(String[] feathers, int layEggs) {
		super(feathers, layEggs);
		setName("penguin");
	}

	@Override
	public void fly() {
		System.out.println(getName()+" dont flies");

	}

}

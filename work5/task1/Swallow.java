package work5.task1;

public class Swallow extends FlyingBird {

	public Swallow(String[] feathers, int layEggs) {
		super(feathers, layEggs);
		setName("swallow");
	}

	@Override
	public void fly() {
		System.out.println(getName()+" flies fast and not high");

	}

}

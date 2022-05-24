package work5.task1;

public class Eagle extends FlyingBird {
	
	public Eagle(String[] feathers, int layEggs) {
		super(feathers, layEggs);
		setName("eagle");
	}

	@Override
	public void fly() {
		System.out.println(getName()+" flies fast and high");
	}

}

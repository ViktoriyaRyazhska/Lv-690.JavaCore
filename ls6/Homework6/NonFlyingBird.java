package ls6.Homework6;

public class NonFlyingBird extends Bird{
	private boolean canRun;
	private boolean canSwim;	
	
	public NonFlyingBird(String feathers, int layEggs, boolean canRun, boolean canSwim) {
		super(feathers, layEggs);
		this.canRun = canRun;
		this.canSwim = canSwim;
	}
		

	public boolean isCanRun() {
		return canRun;
	}

	public void setCanRun(boolean canRun) {
		this.canRun = canRun;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	@Override
	void fly() {
		if (canRun) {
			System.out.println("I don'n can fly, but i run fast");
		} else if (canSwim) {
			System.out.println("I don'n can fly, but i swim fast");
		} else {
			System.out.println("I just walk");
		}
	}
	

}

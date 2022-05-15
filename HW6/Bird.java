package Homework6;

abstract public class Bird {
	private boolean feathers;
	private boolean layEggs;
	
	abstract public boolean fly();
	
	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	public void Print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Bird "+getClass().getSimpleName()+" [feathers=" + feathers + ", layEggs=" + layEggs + ", isFly=" + fly()
				+ "]";
	}


}

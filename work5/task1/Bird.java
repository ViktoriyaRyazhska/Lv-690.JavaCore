package work5.task1;

import java.util.Arrays;

public abstract class Bird {
	private String[] feathers;//feather color
	private int layEggs;//the number of eggs laid
	private String name;
	
	public Bird(String[] feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	public String[] getFeathers() {
		return feathers;
	}
	public void setFeathers(String[] feathers) {
		this.feathers = feathers;
	}
	public int getLayEggs() {
		return layEggs;
	}
	public void setLayEggs(int layEggs) {
		this.layEggs = layEggs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	abstract public void fly();
	
	@Override
	public String toString () {
	return "the name is "+name+", the colors of feathers is " + Arrays.toString (feathers) + ", the number of eggs laid by this bird is " + layEggs;
	}
}

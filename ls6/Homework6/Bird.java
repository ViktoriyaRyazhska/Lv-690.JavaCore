package ls6.Homework6;

public abstract class Bird {
	
	private String feathers;
	private int layEggs;
	
	public Bird( String feathers,int layEggs) {		
		this.feathers = feathers;
		this.layEggs = layEggs;		
	}		
	
	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public int getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(int layEggs) {
		this.layEggs = layEggs;
	}

	abstract void fly();
	

}

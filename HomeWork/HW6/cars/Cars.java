package HW6.cars;

	public abstract class Cars {
	    private String model;
	    private int maxSpeed;
	    private int yearOfManufacture;

	    public abstract void run();
	    public abstract void stop();

	    public Cars(String model, int maxSpeed, int yearOfManufacture) {
	        this.model = model;
	        this.maxSpeed = maxSpeed;
	        this.yearOfManufacture = yearOfManufacture;
	    }



	    @Override
	    public String toString() {
	        return "Cars{" + "model='" + model + ", maxSpeed=" + maxSpeed +
	                ", yearOfManufacture=" + yearOfManufacture +
	                '}';
	    }


	}
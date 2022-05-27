package HW5;

	public class Sedan extends Cars {
	    public void run(){
	        System.out.println("Sedan is running");
	    }

	    public void stop(){
	        System.out.println("Sedan stopped");
	    }

	    public Sedan(String model, int maxSpeed, int yearOfManufacture){
	        super (model, maxSpeed, yearOfManufacture);
	    }
	}
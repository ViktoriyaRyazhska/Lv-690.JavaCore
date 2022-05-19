package HW5;

	import java.util.ArrayList;
	import java.util.List;

	public class CarsMain {

	    public static void main(String[] args) {
	        List<Cars> trucks = new ArrayList<Cars>();
	        trucks.add (new Truck ("Volvo" , 200 , 2009));
	        trucks.add (new Truck("Skoda" , 240 , 2018));
	        trucks.add (new Sedan("BMW" , 80 , 2020));
	        trucks.add (new Sedan("Renault" , 200 , 2012));

	        for (Cars i : trucks){
	            System.out.println(i);
	        }
	    }
	}
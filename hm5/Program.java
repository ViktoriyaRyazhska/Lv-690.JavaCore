package hm5;

public class Program {
public static void main(String[] args) {
 Sedan sedan1=new Sedan();
 Sedan sedan2=new Sedan();
 Truck truck1=new Truck();
 Truck truck2=new Truck();
 Cartask[] cars= {
	sedan1, sedan2, truck1, truck2 
 };
 for(Cartask car: cars) {
	 car.run();
	 car.stop();
 }
 
}
}

package hm3;
import hm3.*;
class Program {
	public static void main(String[] args) {
		Dogs2 d1= new Dogs2("Sharik " , "American bulli " ,9);
		Dogs2 d2= new Dogs2("Julik " , " Boxer " ,10);
		Dogs2 d3= new Dogs2("Rex " , " Pug " ,2);
		System.out.println(d3.getAge());
		d3.setAge(100);
		System.out.println(d3.getAge());
		if(d1.getAge()> d2.getAge() && d1.getAge()> d3.getAge()) {
			System.out.println(d1.getName()+" Old dog");
			}else if(d2.getAge()> d1.getAge() && d2.getAge()> d3.getAge()) {
				System.out.println(d2.getName()+" Old dog");		
				
			}else if(d3.getAge()> d1.getAge() && d3.getAge()> d2.getAge()) {
				System.out.println(d2.getName()+" Old dog");

			}else {
				System.out.println("dogs of the same age");
				
			}
			if(d1.getName()== d2.getName() || d1.getName()== d3.getName() || d2.getName()== d3.getName()) {
			 
			}else {
				System.out.println("No identical names were found");
			}	
			}
	}

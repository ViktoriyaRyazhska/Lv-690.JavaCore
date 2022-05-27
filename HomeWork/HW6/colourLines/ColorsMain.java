//Create three classes: 
//Point with attributes x and y
//Line which contains two object of Point class
//ColorLine with attributes Color  which extends Line class.
//Override method toString() and define method print() in every classes
//In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it. 

package HW6.colourLines;
import java.util.ArrayList;
import java.util.List;

public class ColorsMain {
	
		public static void main(String[] args) {
	        List<Line> list = new ArrayList<Line>();
	        list.add(new Line(new Point(3, 4) , new Point(4, 2) ));
	        list.add(new Line(new Point(2, 5) , new Point(7, 3) ));
	        list.add(new ColorLine(new Point(1 , 7) , new Point(3, 2) , "Green"));
	        list.add(new ColorLine(new Point(-1 , -7) , new Point(-3, -2) , "White"));

	        for (Line i : list){
	            System.out.println(i.print());
	        }
	    }
	}

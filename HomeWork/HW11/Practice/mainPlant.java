package HW11.Practice;

import java.util.ArrayList;

public class mainPlant {
	
	public enum Colors {red, blue, green};
	public enum Types {type1, type2, type3};

	public static void main(String[] args) {
		try {
		System.out.println("res="+squreRectangle(0,-1));
		}
		catch (SquareException e) {
			System.err.println(e.getMessage());
			}
		
		ArrayList<Plant> list = new ArrayList<Plant>();
		addPlant(list, 0, "blue", "type3");
		addPlant(list, 1, "green", "type33");
		addPlant(list, 2, "black", "type11");
		addPlant(list, 3, "red", "type1");		
		addPlant(list, 4, "green", "type2");		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
				
	}
		
	public static void addPlant(ArrayList<Plant> list, int size, String colorStr, String typeStr) {
		try 
		{list.add(new Plant(size, colorStr, typeStr));}
		catch (Exception e) {
			System.err.println(e.getMessage());			
		}	
	}
		
		
	public static int squreRectangle(int a, int b) throws SquareException {
		if (a>0 && b>0) {
			return a*b;
		}
		else {
			throw new SquareException("negative number(s)");
		}
	}

}